package IT_Academy.HW_14;

public class CarBuilder {
    Body buildBody() {
        return new Body("шоколадный", "универсал");
    }

    Engine buildEngine() {
        return new Engine(1.8, 167);
    }

    Car createBuilder() {
        var body = buildBody();
        var engine = buildEngine();
        return new Car(body, engine);
    }
}
