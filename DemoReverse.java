
import java.util.*;
public class DemoReverse {

	public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the number :");
     int num = s.nextInt();
     for( int i=num;i>=0;i--)
     {
    	 System.out.print(i +" ");
     }
	}

}