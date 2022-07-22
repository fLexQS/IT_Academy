package IT_Academy.HW_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseForm extends JFrame implements ActionListener {
    JLabel text;//поле для ввода цифр и действий
    JTextField textField; //поле полного ввода
    double number1 = 0, number2;//переменные для хранения операндов
    String temp, oper; //хранение нажатых кнопок и действия

    public BaseForm() {
        prepareGUI();
        addComponents();
        SetMenu();
    }

    private void prepareGUI() {
        setTitle("Calculator 0.9");
        setSize(900, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //getContentPane().setLayout(null);
        setResizable(true);
        setLocationRelativeTo(null);
    }

    private void addComponents() {
        Container c = getContentPane();
        //поле полного ввода
        textField = new JTextField();
        textField.setText("");
        textField.setFont(new Font("arial", Font.BOLD, 35));
        textField.setForeground((Color.pink));
        textField.setBounds(700, 10, 800, 40);
        c.add(textField, BorderLayout.NORTH);
        //Введенное значение
        text = new JLabel();
        text.setText(" ");
        text.setFont(new Font("arial", Font.BOLD, 50));
        text.setForeground(Color.BLUE);
        text.setBounds(100, 10, 800, 70);
        c.add(text, BorderLayout.CENTER);

        var panelBtn = new JPanel();
        panelBtn.setLayout(new GridLayout(6, 4, 10, 10));
        JButton[] btn = new JButton[24];

        for (var i = 0; i < btn.length; i++) {
            btn[i] = new JButton();
            btn[i].setFont(new Font("Arial", Font.BOLD, 20));
            btn[i].setLocation(100, 30 + 20 * i);//координаты каждой кнопки
            btn[i].setSize(15, 15);//размер каждой кнопки
            btn[i].addActionListener(this);
            panelBtn.add(btn[i]);
        }

        btn[0].setText("%");
        btn[1].setText("CE");//clear entered
        btn[2].setText("C");//clear
        btn[3].setText("BS");//?? backspace u2408
        btn[4].setText("1/x");
        btn[5].setText("X\u00B2");//x^2
        btn[6].setText("\u00B2\u221AX");//sqrt
        btn[7].setText("\u00F7");//divide
        btn[8].setText("7");
        btn[9].setText("8");
        btn[10].setText("9");
        btn[11].setText("\u00D7");//multiply
        btn[12].setText("4");
        btn[13].setText("5");
        btn[14].setText("6");
        btn[15].setText("-");//subtruct
        btn[16].setText("1");
        btn[17].setText("2");
        btn[18].setText("3");
        btn[19].setText("+");//add
        btn[20].setText("\u00B1");//inverse
        btn[21].setText("0");
        btn[22].setText(".");
        btn[23].setText("=");
        c.add(panelBtn, BorderLayout.SOUTH);
    }

    public void SetMenu() {
        var menuBar = new JMenuBar();
        var main = new JMenu("Menu");
        var f = new Font("verdana", Font.BOLD, 16);
        main.setFont(f);
        var info = new JMenuItem("Инфо");
        info.setFont(f);
        main.add(info);
        main.addSeparator();
        var exit = new JMenuItem("Выход");
        exit.setFont(f);
        main.add(exit);
        exit.addActionListener(e -> System.exit(0));
        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, """
                        Попытка\s
                        создать\s
                        калькулятор.\s
                        Обучение в IT Academy""");
            }
        });
        menuBar.add(main);
        setJMenuBar(menuBar);
        pack();
        setPreferredSize(new Dimension(300, 200));
        setVisible(true);
    }

    //переписать бы, чтобы число не пропадало
    private void arifLog(String select_oper) {
        oper = select_oper;
        //if (!select_oper.equals("%")) {
        number1 = getNumber();
        if (textField.getText().contains(" "))
            textField.setText(textField.getText().replaceAll("\s.\s", " " + oper + " "));
        else textField.setText(text.getText().concat(" " + oper + " "));
        //if (text.getText().contains(" "))
        text.setText("");
        // }
    }

    //Сброс всех полей
    private void clear() {
        number1 = 0;
        number2 = 0;
        text.setText("");
        textField.setText("");
    }

    //Сброс ввода
    private void clearCE() {
        text.setText("");
    }

    //Удалить последний символ ввода
    private void backspace() {
        if (text.getText().length() > 0) text.setText(text.getText().substring(0, text.getText().length() - 1));
    }

    //если есть "-" - переприсвоить без первого символа, иначе добавить минус
    private void negate() {
        if (text.getText().contains("-")) text.setText(text.getText().substring(1));
        else text.setText("-" + text.getText());
    }

    //Калькулирование
    private void mainCalc(String oper) {
        switch (oper) {
            case "1/x" -> {
                number1 = getNumber();
                text.setText(String.valueOf(1 / number1));
                textField.setText("1/" + (number1));
            }

            //sqr
            case "X\u00B2" -> {
                number1 = getNumber();
                textField.setText("sqr(" + number1 + ")");
                number1 = Math.pow(number1, 2);
                text.setText(String.valueOf(number1));
            }

            //sqrt
            case "\u00B2\u221AX" -> {
                number1 = getNumber();
                textField.setText("sqrt(" + number1 + ")");
                number1 = Math.sqrt(number1);
                text.setText(String.valueOf(number1));
            }

            // "/"
            case "\u00F7" -> {
                number2 = getNumber();
                textField.setText(number1 + " / " + number2);
                try {
                    number1 /= number2;
                    text.setText(String.valueOf(number1));
                } catch (Exception e) {
                    System.out.println("Деление на 0 недопустимо");
                    e.printStackTrace();
                }
            }

            // "*"
            case "\u00D7" -> {
                number2 = getNumber();
                textField.setText(number1 + " * " + number2);
                number1 *= number2;
                text.setText(String.valueOf(number1));
            }
            case "-" -> {
                number2 = getNumber();
                textField.setText(number1 + " - " + number2);
                number1 -= number2;
                text.setText(String.valueOf(number1));
            }
            case "+" -> {
                number2 = getNumber();
                textField.setText(number1 + " + " + number2);
                number1 += number2;
                text.setText(String.valueOf(number1));
            }
            case "%" -> {
                number2 = number1 * getNumber() / 100;
                textField.setText(textField.getText().concat(String.valueOf(number2)));
                text.setText(String.valueOf(number2));
            }
        }
    }

    public double getNumber() {
        double getNum;
        getNum = Double.parseDouble(text.getText());
        return getNum;
    }

    public void actionPerformed(ActionEvent ev) {
        JButton button = (JButton) ev.getSource();
        temp = button.getText().trim();

        switch (temp) {
            case "\u00F7", "\u00D7", "-", "+" -> arifLog(temp);
            case "C" -> clear();
            case "CE" -> clearCE();
            case "BS" -> backspace();
            case "\u00B1" -> negate();
            case "1/x", "X\u00B2", "\u00B2\u221AX", "%" -> mainCalc(temp);
            case "=" -> mainCalc(oper);
            default -> {
                if (text.getText().equals(" ")) text.setText(button.getText());
                else text.setText(text.getText().concat(button.getText()));
            }
        }
    }
}