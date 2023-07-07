interface Animal {
    void sound();

    default void eat() {
        System.out.println("Animal is eating...");
    }

    static void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

abstract class AbstractAnimal implements Animal {

    public void sound() {
        System.out.println("AbstractAnimal is making a sound...");
    }

    abstract void move();
}

class Dog extends AbstractAnimal {

    void move() {
        System.out.println("Dog is running...");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.move();
        dog.eat(); // Inherited default method from Animal interface
        Animal.sleep(); // Calling static method from Animal interface
    }
}
