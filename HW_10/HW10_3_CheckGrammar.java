package IT_Academy.HW_10;

/**
 * Дано предложение. Необходимо проверить его на наличие ошибок в
 * буквосочетании «жи» и «ши» и исправить их.
 */
public class HW10_3_CheckGrammar {
    public static void main(String[] args) {
        String input =
                "Хорошо в лесу весной! В лужицах голубеет небо. Цветут душистые ландыши. " +
                "Весело живёт лес летом. В густой листве поют птицы. Заботливо снуют ежи и белки. " +
                "Осенью лес дарит нам плоды шиповника и полные лукошки рыжиков." +
                "Жара ужасающе выжигала последние гнезда журавлей, где жили птенцы. ";
        input = input.replaceAll("Жы", "Жи");
        input = input.replaceAll("жы", "жи");
        input = input.replaceAll("Шы", "Ши");
        input = input.replaceAll("шы", "ши");
        System.out.println(input);
    }
}
