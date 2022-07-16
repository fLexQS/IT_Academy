package IT_Academy.HW_10.Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator extends JFrame{
    private JLabel labelNum1, labelNum2, labelResult;
    private JTextField textNum1, textNum2, textResult;
    private JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide;
    private final ActionEvents events = new ActionEvents();

    public Calculator() {
            prepareGUI();
            addComponents();
            addActionEvent();
        }

    public void prepareGUI() {
        setTitle("Calculator22");
        setSize(150, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setVisible(true);
        //getContentPane().setLayout(null);
        setResizable(true);
    }

    public void addComponents() {
        textNum1 = new JTextField("", 10);
        textNum2 = new JTextField("", 10);
        textResult = new JTextField("", 10);
        labelNum1 = new JLabel("Input number 1");
        labelNum2 = new JLabel("Input number 2");
        labelResult = new JLabel("Answer");
        buttonAdd = new JButton("+");
        buttonSubtract = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");

        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        c.add(labelNum1);
        c.add(textNum1);
        c.add(labelNum2);
        c.add(textNum2);
        c.add(buttonAdd);
        c.add(buttonSubtract);
        c.add(buttonMultiply);
        c.add(buttonDivide);
        c.add(labelResult);
        c.add(textResult);
        setVisible(true);
    }

    public void addActionEvent() {
        buttonAdd.addActionListener(events);
        buttonSubtract.addActionListener(events);
        buttonMultiply.addActionListener(events);
        buttonDivide.addActionListener(events);
    }

    public class ActionEvents  implements ActionListener {
        //double a1 = 0, b1 = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton)  e.getSource();
            /*try {
                a1 = Double.parseDouble(textNum1.getText());
            }
            catch (NumberFormatException exc) {
                textNum1.setText("Invalid input entered");
            }
            try {
                b1 = Double.parseDouble(textNum2.getText());
            }
            catch (NumberFormatException exc) {
                textNum2.setText("Invalid input entered");
            }*/
            switch (button.getText()) {
                case  "+" -> showAnswer(addNum());
                case  "-" -> showAnswer(subNum());
                case  "*" -> showAnswer(mulNum());
                case  "/" -> showAnswer(divNum());
            }
        }
    }

    private void showAnswer(double answer) {
        textResult.setText(String.valueOf(answer));
    }

    private double addNum() {
        return Double.parseDouble(textNum1.getText()) + Double.parseDouble(textNum2.getText());
    }

    private double subNum() {
        return Double.parseDouble(textNum1.getText()) - Double.parseDouble(textNum2.getText());
    }

    private double mulNum() {
        return Double.parseDouble(textNum1.getText()) * Double.parseDouble(textNum2.getText());
    }

    private double divNum() {
        BigDecimal bigDecimal = BigDecimal.valueOf(Double.parseDouble(textNum1.getText()) / Double.parseDouble(textNum2.getText())).setScale(6, RoundingMode.HALF_EVEN);
        return bigDecimal.doubleValue();
    }
}
