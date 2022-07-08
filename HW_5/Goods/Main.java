package IT_Academy.HW_5.Goods;

public class Main {
    public static void main(String[] args) {
        var good18 = new IntimateGood("Зайчик", 9999, "шт.");
        System.out.println(good18.getInfo());
        var good21 = new DangerGood("Спички", 15, "упак.",1, 4);
        System.out.println(good21.getInfo());
        var good = new freshGood("Молоко", 100, "литр.",8);
        System.out.println(good.getInfo());
    }
}
