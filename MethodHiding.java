public class PClass 
{
	  public static void m(int x)//Hided Method
	     {
	       System.out.println("===PClass Static m(x)===");
	       System.out.println("the value x : "+x);
	     }
}
public static void m(int x) 
	 {
	    	System.out.println("===CClass Static m(x)===");
	    	System.out.println("The value x:"+x);
	 }
	 
public class MethodHiding {
	public static void main(String[] args) {
      System.out.println("******Using Class*****");
      CClass.m(777);
      System.out.println("******Using Object*****");
      CClass ob = new CClass();
      ob.m(888);
	}
}