// Write a Java program to check if a given year is a leap year.
//If the year is divisible by 4 but not divisible by 100 it is a leap year.
//if the year is divisible by 400 is definately leap year 
package assignment;
import java.util.Scanner;
public class LeapYearCheck 
{
	    public static void main(String[] args) 
	    {   
	        Scanner s = new Scanner(System.in);
            System.out.println("Enter the year : ");
            int year =s.nextInt();
              
            if(year%400==0)//if the year is divisible by 400 is definately leap year 
            {
            	System.out.println("The Year Is Leap-Year");
            }else if(year%4==0 && year%100!=0)
            	//If the year is divisible by 4 but not divisible by 100,it is a leap year.
            {
               	System.out.println("The Year Is Leap-Year");	
            }else 
            {
               	System.out.println("The Year Is not Leap-Year");
            }
	    }

}