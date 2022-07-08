package IT_Academy.HW_1.src;

import javax.swing.*;

public class HW1_3 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Километров целых: " + Integer.parseInt(JOptionPane.showInputDialog("Введите кол-во метров: ")) / 1000);
    }
}
