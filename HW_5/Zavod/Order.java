package IT_Academy.HW_5.Zavod;

public class Order {
    Factory factory;
    int count;
    String[] models;
    int sum = 0;
    Car cars[];

    public Order(Factory factory, int count, String[] models, int ageDealer) {
        this.factory = factory;
        this.count = count;
        this.models = models;
        this.cars = new Car[count];
        this.start(ageDealer);
        //this.showInfoOrder();
    }

    void showInfoOrder() {
        for (var car: cars) {
            if (car != null) System.out.println("Автомобиль " + car.title + " стоит " + car.price);
        }
        System.out.println("Сумма заказа составляет " + sum);
    }

    private void start(int dealerAge) {

        for (var i = 0; i < count; i++){
            this.cars[i] = factory.createCar(models[(int) (Math.random() * models.length)]);
            if (this.cars[i] != null) sum += this.cars[i].price;
        }
        if (dealerAge > 10) {
            sum = (int) (sum * 0.9);
        }
    }
}
