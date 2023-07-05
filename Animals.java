public interface Animals{

     public void makeSound();
     public void eat();
     public void runSpeed();

}

public class Dog implements Animals {

     public void makeSound()
     {
        System.out.println("Barking");
     }
     public void eat()
     {
        System.out.println("eat everything thats human eat");
     }
     public void runSpeed()
     {
        System.out.println("72 km/h");
     } 
}

public class Lion implements Animals {

     public void makeSound()
     {
        System.out.println("Roaring");
     }
     public void eat()
     {
        System.out.println("eat Gosht only");
     }
     public void runSpeed()
     {
        System.out.println("74 km/h");
     } 
}

class DemoAnimals{

    public static void main(String args[]){

      Dog d=new Dog();
      Lion l=new Lion();
 
      d.makeSound();
      d.eat();
      d.runSpeed();

      l.makeSound();
      l.eat();
      l.runSpeed();
}
}
