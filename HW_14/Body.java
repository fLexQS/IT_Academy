package IT_Academy.HW_14;

public class Body {
    private String color;// Цвет кузова
    private String carBody; // Стиль авто (тип кузова)

    public Body(String color, String carBody) {
        this.color = color;
        this.carBody = carBody;
    }

    public String getColor() {
        return color;
    }

    public String getCarBody() {
        return carBody;
    }
}
