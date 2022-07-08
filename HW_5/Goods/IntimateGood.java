package IT_Academy.HW_5.Goods;

public class IntimateGood extends Good{
    public IntimateGood(String title, int price, String measure) {
        super(title, price, measure);
    }

    String getInfo() {
        return super.getInfo() + "Доступен только лицам, страше 18 лет.\n";
    }
}
