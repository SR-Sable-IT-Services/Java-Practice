public class fibonacci_series {
public static void main(String[] args) {
	int a=0,b=1;
	int c=0;
	for(int i=1;i<=10;i++) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
	}
}
}