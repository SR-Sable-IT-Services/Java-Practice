/*Write a program to reverse the given String ?*/

class palindromeString{
public static void main(String args[]){

      String real="hello";
      String rev="";
   
    for(int i=real.length()-1;i>=0;i--)
    {
         rev=rev+real.charAt(i);
    }
    
    if(real.equals(rev))
    {
          System.out.println("its an Palindrome String");
    }
    else
    {
         System.out.println("its not an Palindrome String"); 
    }
}
}
