package IT_Academy.HW_14;

public class Car {

    boolean isEngine;// Состояние двигателя (запущен или нет
    Body body;
    Engine engine;

    public Car(Body body, Engine engine) {
        this.body = body;
        this.engine = engine;
        this.isEngine = false;
    }

    public Body getBody() {
        return body;
    }


    public Engine getEngine() {
        return engine;
    }

    void onEngine() {
        if (isEngine) System.out.println("Двигатель уже был заведен");
        else isEngine = true;
    }

    void offEngine() {
        if (isEngine) isEngine = false;
        else System.out.println("Двигатель не был заведен")
        ;
    }

    //Общее описание авто
    public String toString() {
        var bulder = new StringBuilder();
        bulder.append("Цвет кузова - ").append(body.getColor()).append("\nТип кузова - ").append(body.getCarBody());
        bulder.append("\nОбъем двигателя: ").append(engine.getEngineVolume()).append("\nМощность двигателя: ").append(engine.getEnginePower());
        if (isEngine) {
            bulder.append("\nДвигатель включен");
        } else {
            bulder.append("\nДвигатель выключен");
        }
        return bulder.toString();
    }

    //Заведен ли авто?
    public String getState() {
        if (isEngine) {
            return "Двигатель включен\n";

        } else {
            return ("Двигатель выключен\n");
        }
    }

}
