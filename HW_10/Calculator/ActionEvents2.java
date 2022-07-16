package IT_Academy.HW_10.Calculator;
/*
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvents  implements ActionListener {
    @Override
    public class ActionEvents  implements ActionListener {
        double a1 = 0, b1 = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton button = (JButton)  e.getSource();
            try {
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
            }
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
        return Double.parseDouble(textNum1.getText()) / Double.parseDouble(textNum2.getText());
    }
}
*/