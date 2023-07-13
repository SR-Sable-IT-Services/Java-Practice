class ExceptionAssessment{
public static void main(String args[]){

     int a =12;
     int c =0;

   try{
     int d=a/c;
      }
   catch(ArithmeticException ar)
      {
         System.out.println(ar);
      }

   catch(Exception e)
      {
         System.out.println(e);    
      }
  
}
}