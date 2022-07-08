package IT_Academy.HW_5.Goods;

public class Good {
    private String title;
    private int price;
    private String measure;

    public Good(String title, int price, String measure) {
        this.title = title;
        this.price = price;
        this.measure = measure;
    }

    public String getTitle() {return this.title;}

    public void setTitle(String title) {this.title = title;}

    public int getPrice() {return this.price;}

    public void setPrice(int price) {this.price = price;}

    public String getMeasure() {return this.measure;}

    public void setMeasure(String title) {this.measure = measure;}

    String getInfo() {
        return "товар " + title + " стоит " + price + " руб. за " + measure + "\n";
    }
}
