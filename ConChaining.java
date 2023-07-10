public class PClass 
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


//define Constructor Chaining process?
//  =>The process of linking multiple constructors using super() and this() for execution 
//    is known Constructor Chaining process or Constructor Linking process.


public class ConChaining
{
} {

	public static void main(String[] args) 
	{
	  CClass ob = new CClass(11,22,33,44);	
	}
}
