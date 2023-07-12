//    static polymorphism 
//==> the programing component having many forms at compilation stage is konwn as compiletime polimorpism
//==> using instance method overloding process we can intialize the static polymorphism 
//==> we can use static method 
public class ClassA {  

		public int add(int a , int b) {
			return a+b;
		}
		public double add(int a , double b) {
			return a+b;
		}	
		public float add(int a , int b , float c) {
			return a+b+c;
		}	
}


public class Calculator extends ClassA {

	public static void main(String[] args) {
		Calculator ob = new Calculator;
		
		int sum1 =ob.add(1,5);
		System.out.println("Addition of *int valus*:"+sum1);
		double sum2 =ob.add(1,2.50);
		System.out.println("Addition of *int,double valus* :"+sum2);
		float sum3 =ob.add(1,2,3.5f);
		System.out.println("Addition of *int, float valus* :"+sum3);
	}

}
