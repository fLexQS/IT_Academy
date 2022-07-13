package IT_Academy.HW_10;

import java.util.Locale;

public class HW10_2_SwapHalfAndUpperWord {
    public static void main(String[] args) {
        String full = "Чудеса";
        String half = full.substring(0,full.length()/2);
        full = full.substring(full.length()/2).concat(half).toUpperCase(Locale.ROOT);
        System.out.println(full);
    }
}
