package IT_Academy.HW_5.Zavod;

import java.util.Arrays;
import java.util.stream.Stream;

public class Factory {
    String titleFactory;
    String[] models;
    int[] count;

    public Factory(String titleFactory, String[] titleModels) {
        this.titleFactory = titleFactory;
        this.models = titleModels;
        count = new int[models.length];
    }

    Car createCar(String titleCar) {
        for (int i=0;i<models.length;i++) {
            if (models[i].equals(titleCar)) {
                System.out.println("Начинается сборка авто " + titleCar);
                var car = new Car(titleCar, (int) (Math.random() * 4000 + 1000));
                count[i] += 1;
                return car;
            }
        }
        System.out.println("Модель " + titleCar + " не выпускается");
        return null;
    }

    public void getInfoAboutCompeteConstruct() {
        System.out.println("Всего было изготовлено на заводе:");
        for(int i = 0; i< models.length; i++) {
            System.out.println(models[i] + " " + count[i] + " шт.");
        }
    }
}
