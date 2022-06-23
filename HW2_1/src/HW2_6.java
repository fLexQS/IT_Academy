public class HW2_6 {
    /**
     * Написать программу сравнения двух случайных чисел. В результате должна
     * содержаться информация – насколько одно число больше другого. Используйте
     * модуль числа
     * диапозон [-100;100]
     */
    public static int genNumb () {
        return (int) (Math.random()*200-100);//генератор -100;100
    }
    public static void main(String[] args) {
        int a = genNumb();
        int b = genNumb();
        if (a == b) System.out.println("Числа равны "+ a);
        else System.out.println("Разница между " + a + " и " + b + " равна " + Math.abs(a-b));
    }
}
