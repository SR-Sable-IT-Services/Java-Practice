/*Write a program to reverse the given String ?*/

class palindromeString{
public static void main(String args[]){

      String real="hello";
      String rev="";
   
    for(int i=real.length()-1;i>=0;i--)
    {
         rev=rev+real.charAt(i);
    }
    
    System.out.print("'"+rev+"' this is a Reverse String Of '"+real+"'");
}
}
