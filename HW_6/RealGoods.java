package IT_Academy.HW_6;

public class RealGoods extends Goods{
    public RealGoods() {
        setTitle("Физический товар");
        calcCost();
    }

    @Override
    void setRate() {rate = 1;}
}
