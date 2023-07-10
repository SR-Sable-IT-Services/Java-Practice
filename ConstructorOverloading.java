public class PClass //Constructor Overloading process 
{
	 public PClass(int a)
	   {
	    	System.out.println("a :"+a);
	   }
	   public PClass(int a, int b )
	   {
	       this(a);// this () is used to call the constructers from the same class
		   System.out.println("b :"+b);   
	   }
}


public class CClass extends PClass
{
	 public CClass(int a ,int b, int c ,int d)
	    {
	    	this(a,b,c);// this() is used to call the constructer from the same classss
	    	System.out.println("d :"+d);
	    }
	   public CClass(int a , int b, int c)
	    {
	    	super(a,b);// super () is used to call the constructers from the  parent class/super class
	    	System.out.println("c :"+c);
	    }
}

public class ConstructorOverloading //Constructor Overloading process 
{
	public static void main(String[] args) 
	{
	  CClass ob = new CClass(11,22,33,44);	
	}
}
