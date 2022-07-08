package IT_Academy.HW_6;

public abstract class Goods {
    private String title;
    private int cost;
    private final int BASE_COST = 100;
    //private String measure;
    protected double rate;

    public void setTitle(String title) {this.title = title; }

    public int getCost() {
        return cost;
    }

    abstract void setRate();

    void calcCost(){
        setRate();
        cost = (int) (rate * BASE_COST);
        System.out.println("Стоимость приобритения " + title + " равна " + cost);
    }
}
