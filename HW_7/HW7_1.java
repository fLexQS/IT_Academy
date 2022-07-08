package IT_Academy.HW_7;
//не исправлено: дублирование вывода массива в случае ошибки
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class HW7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввведите челочисленные элементы массива через пробел:");
        String[] strings = scanner.nextLine().split(" ");
        int[] intArray = new int[strings.length];
        try {
            for (int i = 0; i < intArray.length; i++) {
                //if(Character.isDigit(strings[i].charAt(strings[i].length() - 1)))
                intArray[i] = Integer.parseInt(strings[i]);
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Было введено не целочисленое значение, значения введенные до причины ошибки " + e.getLocalizedMessage()); //
            System.out.println(Arrays.toString(IntStream.rangeClosed(2, intArray.length).mapToObj(i -> intArray[intArray.length - i]).toArray()));
        }
        catch (Exception e) {
            System.out.println("Возникла неизвестная ошибка" + e.getMessage());
        }
        scanner.close();
        System.out.println("Введенный массив в обратном порядке:\r\n" +
                Arrays.toString(IntStream.rangeClosed(1, intArray.length).mapToObj(i -> intArray[intArray.length - i]).toArray()));
    }
}
