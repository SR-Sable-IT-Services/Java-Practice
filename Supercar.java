// Car superclass
class Car {
    public void start() {
        System.out.println("Car started.");
    }
}

// SportsCar subclass extending Car
class SportsCar extends Car {
    @Override
    public void start() {
        super.start();  // Calling the start() method of the superclass
        System.out.println("Sports car started.");
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.start();
    }
}

