package IT_Academy.HW_5.Goods;

public class freshGood extends Good{
    int lifetime;

    public freshGood(String title, int price, String measure, int lifetime) {
        super(title, price, measure);
        this.lifetime = lifetime;
    }

    String getInfo() {
        return super.getInfo() + "Срок хранения составляет " + lifetime + " дней.\n";
    }
}
