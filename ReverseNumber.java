/* Write a program to reverse the given number.*/

class ReverseNumber{
      public static void main(String rgs[]){

       int rem , rev=0;
       int no=5562;

     while(no != 0)
      {
        rem=no%10;
        rev=rev*10+rem;
        no=no/10; 
      }
     
     System.out.println("Reverse of given number is :"+rev);
}
}