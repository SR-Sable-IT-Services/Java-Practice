//Write the program to calculate the Factorial of the given number.

// what is the factorial number ?
//=> factorial is nothing but multiplication of all the previous number

package assignment;
import java.util.*;
public class FactorialNo {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num : ");
        
         int num=s.nextInt();
		 int factorial=1;
		 for(int i=num;i>0;i--)
		 {
			 factorial  = factorial*i;		//5x4x3x2x1	 
		 }
		 System.out.println(factorial); 
	}

}
