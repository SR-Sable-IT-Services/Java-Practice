public class PClass 
{
	
	     public void m(int a)
	     {
	    	
	    	 System.out.println("PClass the value of a : "+a);
	     }
	     
	     public void m( int a , int b )
	     {
	    	
	    	this.m(a);
	    	System.out.println("PClass the value of b : "+b);
	     }
	     
}

public class CClass extends PClass
{
	 public void m(int a ,int b ,int c ,int d)
     {
    	 this.m(a,b,c);
    	 System.out.println("CClass the value of d : "+d);
     }
     
     public void m( int a , int b ,int c)
     {
    	super.m(a,b);
    	System.out.println("CClass the value of c : "+c);
     }
}
public class InstanceMethodOverloding {

	public static void main(String[] args)
	{
		CClass ob = new CClass();
		   /* ob.m(11);
		    ob.m(11,22);
		    ob.m(11,22,33);	*/
		    ob.m(11,22,33,44);
	}

}