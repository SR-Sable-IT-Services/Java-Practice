// abstraction using abstract class
public abstract class Animal {  // AbstractClass
     public abstract void animalSound();
}

public class Elephant extends Animal { // sub class
	public void animalSound()
	  {
		  System.out.println("Elephant  voice .....");
	  }
}

public class Tiger extends Animal //sub class
{
  public void animalSound()
  {
	  System.out.println("tiger voice .....");
  }
}

public class AnimalMainClass  { //MainClass

	public static void main(String[] args) 
	{
	Tiger t = new Tiger();
	System.out.println("==Tiger Class==");
	t.animalSound();
	
	Elephant e= new Elephant();
	System.out.println("==Elephant Class==");
	e.animalSound();
	
	}

}