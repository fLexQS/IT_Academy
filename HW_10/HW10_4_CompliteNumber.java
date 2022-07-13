package IT_Academy.HW_10;

import java.util.Scanner;

public class HW10_4_CompliteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.contains(".") || str.contains(","))
            System.out.println("Введено дробное число");
        else
            System.out.println("Введено целое число");
    }
}
