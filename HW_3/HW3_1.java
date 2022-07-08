package IT_Academy.HW_3;

import java.sql.SQLOutput;

public class HW3_1 {
    public static void main(String[] args) {
        String[] Chess = {"a","b","c","d","e","f","g","h"}; //массив букв
            for (int i =Chess.length; i > 0; i--) {//цикл строк
                for (String e : Chess) { //цикл в строке
                    System.out.printf("%s%d\t", e, i);
                }
                System.out.println();
                }
        /*без массива
            for (int i = 8; i > 0; i--){
            for (char a = 'a'; a <= 'h'; a++)
            {
                System.out.printf("%c%d\t", a, i);
            }
            System.out.println();
        }*/
    }
    }