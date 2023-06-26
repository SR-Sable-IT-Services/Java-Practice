import java.util.Scanner;
class PalindromeNumber{
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number to check if its a Palindrome numberor not");
      int no=sc.nextInt();
    System.out.println("Please enter same number again");
      int no2=sc.nextInt();
      int rev=0,rem;

     while(no!=0)
     {
      rem=no%10;
      rev=rev*10+rem;
      no=no/10; 
     }
   if (no2==rev)
     {
       System.out.println("Given number is Palindrome number");
     }
   else
     {
       System.out.println("Given number is not Palindrome number");
     }
}
}