import java.util.Scanner;
class ReverseString{
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String to reverse it");
    String s=sc.nextLine();
    String rev="";

   for(int i=s.length()-1;i>=0;i--)
   {
     rev=rev+s.charAt(i);
   }
      System.out.println("'"+rev+"' this is a Reverse String Of '"+s+"'");   
}
}