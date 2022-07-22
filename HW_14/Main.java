package IT_Academy.HW_14;

public class Main {
    public static void separator() {
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        var car = builder.createBuilder();
        separator();
        System.out.println("Информация о вашей машине");
        System.out.println(car);
        separator();
        car.onEngine();
        System.out.println(car.getState() + "Пристегивайтесь и удачной поездки!");
        separator();
        car.onEngine();
        separator();
    }
}
