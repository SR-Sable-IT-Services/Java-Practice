public class FebonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num =s.nextInt();
	 int a=0;
	 int b=1;
	 System.out.println(a+" "+b);
	 int c;
	 for(int i=1; i<=num; i++)
	 {
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	 }

	}

}
