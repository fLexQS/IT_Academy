package IT_Academy.HW_14;

public class Engine {
    double Displacement; //Объем двигателя
    int horsePower; //Мощность двигателя

    public Engine(double Displacement, int horsePower) {
        this.Displacement = Displacement;
        this.horsePower = horsePower;
    }

    public double getEngineVolume() {
        return Displacement;
    }

    public int getEnginePower() {
        return horsePower;
    }
}
