// Animal interface
public interface Animal {
  
    static void commonSound() {
        System.out.println("Animals make sounds.");
    }

 
    default void sleep() {
        System.out.println("The animal is sleeping.");
    
    void eat();
}


public abstract class AbstractAnimal implements Animal {
  
    public void eat() {
        System.out.println("The animal is eating.");
    }


    public abstract void sound();
}


public class Dog extends AbstractAnimal {
    
    public void sound() {
        System.out.println("The dog barks.");
    }
}


public class Cat extends AbstractAnimal {
    
    public void sound() {
        System.out.println("The cat meows.");
    }
}


public class Main {
    public static void main(String[] args) {
        
        Animal.commonSound();
        

        
        Dog dog = new Dog();
        
        Cat cat = new Cat();


        dog.sleep();
        

        
        dog.eat();
        
       
        dog.sound();
        
       
        cat.sleep();
        

        
        cat.eat();
       

        
        cat.sound();
        
    }
}
