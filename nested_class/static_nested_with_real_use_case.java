package nested_class;

// Create Car with static nested Engine having start method.
class Car {
    static class Engine {
        void start() {
            System.out.println("Engine started");
        }
    }
}

public class static_nested_with_real_use_case {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine();
        engine.start();
    }
}
