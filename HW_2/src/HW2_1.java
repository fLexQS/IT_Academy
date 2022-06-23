package IT_Academy.HW_2.src;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class HW2_1 {
    public static void main(String[] args) {
        /**
         * Вывести на экран все целые числа от 100 до 200 кратные 3
         */
        int y = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 3 == 0) {
                if ((y % 5 == 0)&&(y > 0)) System.out.println(); //разбитие на блоки
                System.out.print(i + "\t");
                y++;
            }

        }
    }
}
