package IT_Academy.HW_6;

public class WeightGoods extends Goods{
    double weight;
    public WeightGoods(double w) {
        setTitle("Весовой товар");
        this.weight = w;
        calcCost();
    }

    @Override
    void setRate() {rate = weight;}
}
