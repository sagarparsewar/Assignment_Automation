package isareletionship;
// Has -A reletionship

class Engine {
    public void start() {
        System.out.println("The engine starts");
    }
}


class Car {
    private Engine engine;
    
    public Car() {
        engine = new Engine();
    }
    
    public void startCar() {
        engine.start();
        System.out.println("The car starts moving");
    }
}
public class CarEngineExample {
	public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}