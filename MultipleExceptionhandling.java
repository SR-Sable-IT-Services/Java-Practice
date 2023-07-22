//***Multiple Exception Handling***\\
//Process-1 : Multiple Exceptions are handled by declaring Multiple Catch blocks to a single try block
//process-2 : from java7 version onward we can declared single catch blocks to hold multiple exception 
package main;
import java.util.Scanner;
import java.util.InputMismatchException;
public class MultipleExceptionhandling 
{
	public static void main(String[] args) 
	{
	  Scanner s = new Scanner(System.in);
	  try 
	  {
		System.out.println("enter the no of employee work on this project :");
		int n = s.nextInt();// exception when we input is other than int data
	    int a = 200/n; // exception when n=0
	    System.out.println("Each employee work for "+a+" hrs");
	  }
	  catch(ArithmeticException | InputMismatchException ob)// from java7 version onward
	  {
		System.out.println("Enter only Non-Zero value.....");
		System.out.println("details :"+ob.getMessage());
        System.out.println("Exception_type_Class :"+ob.getClass());
//=>getClass() method is from 'java.lang..Object' class and 
//=>which is used to display the class_name of an object.
        s.close();
       //finally { }
	  }
	}

}
