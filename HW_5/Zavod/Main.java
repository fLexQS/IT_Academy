package IT_Academy.HW_5.Zavod;

public class Main {
    public static void main(String[] args) {
        String[] models = {"Гранта","Веста","Нива","X-Ray","ВMW 5"};
        Factory factory = new Factory("АвтоВАЗ", new String[]{"Гранта", "Веста", "Нива", "X-Ray"});
        int count = (int) (Math.random() * 20 + 20);
        Dealer diler = new Dealer("СтулАвто", 20);
        diler.createOrder(factory,count,models);
        factory.getInfoAboutCompeteConstruct();
    }
}
