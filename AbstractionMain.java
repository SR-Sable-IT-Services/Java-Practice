/* wirte a one interface , one abstract class which will be the sub class of
 interface and one concrete class which will be the sub class of abstract class.
Animal => interface with static and default method. */

interface Animals{
    static String region()
    {
        return "India";
    }

    public default void run()
    {
        System.out.println("Animals are running");
    }

    void eat();

}

abstract class PetAnimals implements Animals {

    abstract void  makeSound();
}

class Dog extends PetAnimals{
       public void eat()
        {
        System.out.println("Dog eat Anything");
        }

        void  makeSound()
        {
        System.out.println("Barking ....");
        }
  
    }

public class AbstractionMain{
    public static void main(String args[]){
        Dog d=new Dog();
        d.eat();
        d.makeSound();
        d.run();

        System.out.println(Animals.region());
    }
}


