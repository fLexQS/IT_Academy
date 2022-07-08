package IT_Academy.HW_4;

public class Practice {
    public static void main(String[] args) {
        String s = "#";
        for (int i = 1; i <= 20; i++) {
            /*for (int y = 1; y <= i; y++) {
                System.out.print('#');
            }*/
            System.out.println(s);
            s += s + "#";
            //System.out.println();
        }
    }
}
