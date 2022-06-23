public class HW2_3 {
    /**
     * Вывести все простые числа от 2 до 100
     */
    public static void main(String[] args) {
        for (int i =2; i <=100; i++) {
            boolean Simpl = true;
             for (int y =2; y <= i/2; y++)
                 if (i % y == 0) Simpl = false;
             if (Simpl) {
                 System.out.print(i + "\t");
             }
        }
    }
}
