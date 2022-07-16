package IT_Academy.HW_10;

/**
 * Дано слово из четного числа букв. Поменять местами его половины. Вывести
 * полученную строку в верхнем регистре.
 */

public class HW10_2_SwapHalfAndUpperWord {
    public static void main(String[] args) {
        String full = "Чудеса";
        full = full.substring(full.length()/2).concat(full.substring(0, full.length()/2));
        System.out.println(full.toUpperCase());
    }
}
