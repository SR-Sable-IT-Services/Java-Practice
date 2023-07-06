
class Car { // super class
    public void startCar()
    {
    System.out.println("*call from super class*");
	System.out.println("your kia has started");
	}

}


class Kia extends Car // child class
{
	public void startCar()
    {
	super.startCar(); // call to super class method 
	System.out.println("*call From childClass*");
	System.out.println("your kia has started");
	
	}
}

class Vehical // main class
    {
	  public static void main (String args[])
	  {
		Kia k = new Kia();
		k.startCar();// call to child class method  
	  }
	
	}