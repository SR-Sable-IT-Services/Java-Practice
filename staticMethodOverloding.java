public class PClass {
   public static void m(int a) {
	   System.out.println("PClass a:"+a);
   }
   public static void m(int a,int b) {
	   System.out.println("PClass b:"+b);
	   System.out.println("PClass b:"+b);
   }
}


public class CClass extends PClass{
	 public static void m(int a,int b,int c,int d) {
		   System.out.println("CClass a:"+a);
		   System.out.println("PClass b:"+b);
		   System.out.println("PClass c:"+c);
		   System.out.println("PClass d:"+d);
	   }
	 public static void m(int a,int b,int c) {
		   System.out.println("CClass a:"+a);
		   System.out.println("PClass b:"+b);
		   System.out.println("PClass c:"+c);
	   }
}

public class staticMethodOverloding {
	public static void main(String[] args) {
      CClass.m(1, 2, 3,4);
      CClass.m(1, 2, 3);
      CClass.m(1, 2);
      CClass.m(1);
	}
}
