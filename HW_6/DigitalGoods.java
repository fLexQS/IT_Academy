package IT_Academy.HW_6;

public class DigitalGoods extends Goods{
    public DigitalGoods() {
        setTitle("Цифровой товар");
        calcCost();
    }

    @Override
    void setRate() {rate = 0.5;}
}
