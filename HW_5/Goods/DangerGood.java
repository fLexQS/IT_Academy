package IT_Academy.HW_5.Goods;

public class DangerGood extends Good{
    int dangerZone;
    int lvlRisk;

    public DangerGood(String title, int price, String measure, int dangerZone, int lvlRisk) {
        super(title, price, measure);
        this.dangerZone = dangerZone;
        this.lvlRisk = lvlRisk;
    }

    String getInfo() {
        return super.getInfo() + "Изделение представляется опасность в радиусе " + dangerZone + " метров.\n"
                + "Принадлежит к товарам " + lvlRisk + " уровня опасности.\n";
    }
}
