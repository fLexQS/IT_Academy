package IT_Academy.HW_4;

import java.util.Arrays;

public class HW4_1 {
    public static void main(String[] args) {
        int matrix[][] = new int[5][5];
        int downline[] = new int[5];
        int sum;
        String str = "--\t";
        for (int i = 0;i < matrix.length; i++) {
            sum = 0;
            for (int y = 0; y < matrix.length; y++) {
                matrix[i][y] = i * y;
                sum += matrix[i][y];
                downline[y] += matrix[i][y];
                System.out.print(matrix[i][y] + "\t");
            }
            System.out.println(" | " + sum);
        }
        System.out.println(str.repeat(5));
        for (int a:downline
             ) {
            System.out.print(a + "\t");
        };
    }
}
