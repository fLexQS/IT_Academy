package IT_Academy.HW_10;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Даны названия трех городов. Вывести самое длинное и самое короткое.
 */

public class HW10_1_ThreeCities {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        Collections.addAll(list,"Москва", "Владивосток", "Уфа");
        System.out.println("Наименование городов с максимальным и минимальным кол-ом букв:");
        list.stream().sorted((o1, o2) -> Math.abs(o1.length() - o2.length())).skip(1).forEach(System.out::println);
    }
}
