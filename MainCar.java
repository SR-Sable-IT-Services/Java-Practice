class Car {
    public void start() {
        System.out.println("Car starting...");
    }
}

class SportsCar extends Car {
    @Override
    public void start() {
        super.start(); // Calling superclass start method
        System.out.println("Sports car starting...");
    }
}

public class MainCar {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.start();
    }
}
