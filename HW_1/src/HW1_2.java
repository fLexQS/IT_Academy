package IT_Academy.HW_1.src;

import javax.swing.*;
import java.math.*;

public class HW1_2 {
    public static void main(String[] args) {
        int res = Integer.parseInt(JOptionPane.showInputDialog("Введите первое число")) * 2;
        res = res -3 + Integer.parseInt(JOptionPane.showInputDialog("Введите второе число"));
        res = (int) (res + Math.pow(Integer.parseInt(JOptionPane.showInputDialog("Введите третье число")), 2));

        JOptionPane.showMessageDialog(null, "Результат: " +res);
    }
}
