class Engine {
    public void start() {
        System.out.println("Mesin mobil telah hidup");
    }
}

class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine; // Aggregation
    }

    public void startCar() {
        engine.start();
        System.out.println("Mobil berjalan.");
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Car car = new Car(engine);
        car.startCar();
    }
}
