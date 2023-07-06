// Superclass Car
class Car {
    public void start() {
        System.out.println("Car is starting...");
    }
}

// Subclass SportsCar
class SportsCar extends Car {
    @Override
    public void start() {
        super.start();  // Calling superclass start() method
        System.out.println("SportsCar is starting...");
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.start();  // Calling subclass start() method
    }
}
