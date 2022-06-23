import javax.swing.*;

public class HW2_2 {
    /**
     * Сделать проверку ученика на знание таблицы умножения. Задается 5 примеров, где
     * спрашиваем ответ на вопрос по умножению двух случайных чисел. Если ответ не
     * верный, то увеличиваем счетчик ошибок на 1. После примеров выставляем
     * зачет/незачет
     */
    static final int limit = 1; //порог зачёта
    static int a = 0, b = 0, x = 0;
    public static String genMulti () {
        a = (int) (Math.random()*9+1);
        b = (int) (Math.random()*9+1);
        return "Произведение чисел " + a + " и " + b;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int ans = Integer.parseInt(JOptionPane.showInputDialog(genMulti()));
            if (ans != a * b)  x++;
        }
        if (x > limit) JOptionPane.showMessageDialog(null, "Тест не пройден");
                else JOptionPane.showMessageDialog(null, "Тест пройден");
    }
}
