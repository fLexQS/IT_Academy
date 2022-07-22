package IT_Academy.HW_exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

//форма построенна криво

public class BaseWindow extends JFrame implements ActionListener, KeyListener {
    JLabel text, nick;//поле для ввода
    JTextField textField; //окно чата
    Messages mes;
    String user = "";
    Date date;

    public BaseWindow() throws FileNotFoundException {
        mes = new Messages("src/IT_Academy/HW_exam/log.txt");
        prepareGUI();
        addComponents();
        SetMenu();
    }

    private void prepareGUI() {
        setTitle("Message 0.9");
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //getContentPane().setLayout(null);
        setResizable(true);
        setLocationRelativeTo(null);
    }

    private void addComponents() throws FileNotFoundException {
        Container c = getContentPane();
        //Введенное значение
        text = new JLabel();
        text.setText(mes.start()+"</html>");//чтобы не переписывать конец файла html только на форме
        text.setFont(new Font("arial", Font.BOLD, 25));
        text.setForeground(Color.BLUE);
        //text.setBounds(100, 10, 800, 80);
        c.add(text, BorderLayout.NORTH);

        //для отображения ника
        nick = new JLabel();
        nick.setText("");
        nick.setFont(new Font("arial", Font.BOLD, 25));
        nick.setForeground(Color.CYAN);
        c.add(nick,BorderLayout.WEST);

        //поле полного ввода
        textField = new JTextField();
        textField.setText("Enter your nick:");
        textField.setFont(new Font("arial", Font.BOLD, 25));
        textField.setForeground((Color.pink));
        //textField.setBounds(100, 800, 800, 800);
        c.add(textField, BorderLayout.SOUTH);

        //кнопка ввода, не смог нормально в угол запинить
        JButton SubmitButton = new JButton("Submit");
        SubmitButton.setFont(new Font("Arial", Font.BOLD, 20));
        //Enter.setLocation(800, 800);//координаты кнопки
        //Enter.setSize(25, 25);//размер кнопки
        //Enter.setBounds(900, 800, 20, 20);

        //Нажатие кнопки или Enter при наборе текста
        SubmitButton.addActionListener(this);
        textField.addKeyListener(this);

        //var group = new ButtonGroup();
        //group.add(text);
        c.add(SubmitButton, BorderLayout.EAST);
        setVisible(true);
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
                        Тип\s
                        чат.\s
                        Обучение в IT Academy""");
            }
        });
        menuBar.add(main);
        setJMenuBar(menuBar);
        pack();
        setPreferredSize(new Dimension(300, 200));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String temp = textField.getText();
        date = new Date();
        if (user.isEmpty()) {
            user = temp.substring(17);
            text.setText("");
        } else {
            //добавляем в строку, чтобы отрисовывалось построчно
            //temp = String.format(user + ";%t %<f;" + temp + "\r\n", date);
            temp = user + ";" + date + ";" + temp;
            try {
                mes.input(temp);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            //докидываем введенное в конец формы, перенося html
            text.setText(text.getText().substring(0,text.getText().length()-7).concat("<br>"+ temp+"</html>"));
        }
    }

    public void keyPressed(KeyEvent ek) {
        if (ek.getKeyCode() == KeyEvent.VK_ENTER) {
            String temp = textField.getText();

            if (user.isEmpty()) {
                user = temp.substring(16);//
                nick.setText(user);
                textField.setText("");
                text.setText(text.getText().substring(0,text.getText().length()-7).concat("<br>Пользователь "+ user +" врывается в чат!</html>"));
            } else {
                //урезать дату??
                date = new Date();
                //добавляем в строку, чтобы отрисовывалось построчно
                //temp = String.format(user + ";%t %<f;" + temp + "\r\n", date);
                try {
                    mes.input("<br>"+ user + ";" + date + ";" + temp);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                //докидываем введенное в конец формы, перенося html
                text.setText(text.getText().substring(0,text.getText().length()-7).concat("<br>"+ user + " " + date + " " + temp +"</html>"));
                textField.setText("");
            }
        }
    }
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    public void keyTyped(KeyEvent arg0) {

    }
}
