package IT_Academy.HW_7;

import java.util.Random;

public class HW7_2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int temp;
        Random rn = new Random();
        for (int i = 0;i < a.length; i++) {
            a[i] = rn.nextInt(10);
            b[i] = rn.nextInt(10);
        }
        try {
            for (int i = 0; i < a.length; i++) {
                for (int y = 0; y < b.length; y++)
                    temp = a[i] / b[y];
            }
        }
        catch (ArithmeticException e){
            System.out.println("Была выявлена попытка деления на 0 - " + e.getMessage());
        }
    }
}
