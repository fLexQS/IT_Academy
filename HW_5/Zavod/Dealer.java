package IT_Academy.HW_5.Zavod;

public class Dealer {
    String titleDealer;
    int ageDealer;

    public Dealer(String titleDealer, int ageDealer) {
        this.titleDealer = titleDealer;
        this.ageDealer = ageDealer;
    }

    void createOrder(Factory factory, int count, String[] models){
        var order = new Order(factory, count, models, ageDealer);
        order.showInfoOrder();
    }
}
