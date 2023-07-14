/*  Assessment 14/07/2023
 try
 catch
 throw
.throws
 finally
 checked
 unchecked
         */

class SuperException extends ArithmeticException{
   int add(int a , int b,int c)
   {
      return a+b+c;
   }

  int devide(int a , int b) throws ArithmeticException
   {
      return a/b;
   }
}

class ExceptionThrowsKey {
 public static void main(String args[]){

ExceptionThrowsKey obj2=new ExceptionThrowsKey();

  try{
     System.out.println(obj2.display());

   }catch(ArithmeticException e)
    {
     System.out.println(e);
    }

     System.out.println("Normal flow of the program");

  }

  int display()throws ArithmeticException
   {
      return  display2();
   }

  int display2()throws ArithmeticException
   {
      SuperException obj=new SuperException();
      return obj.devide(12 ,0);
   }
 
     

}