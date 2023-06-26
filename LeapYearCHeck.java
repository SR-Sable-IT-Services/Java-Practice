import java.util.Scanner;
class LeapYearCHeck{
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Year to check if its a Leap Year or not");
    int year=sc.nextInt();

   if ((year%400==0) && (year%4==0 && year%100 !=0))
    {
       System.out.println(year+" Is a Leap Year");
    }
   else
    {
       System.out.println(year+" Is not a Leap Year");
    }
}
}