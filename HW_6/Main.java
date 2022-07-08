package IT_Academy.HW_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new DigitalGoods();
        new RealGoods();
        System.out.println("Введите кол-во килограмм");
        new WeightGoods(scanner.nextDouble());
        scanner.close();
    }
}
