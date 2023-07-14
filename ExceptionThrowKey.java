/*  Assessment 14/07/2023
 try
 catch
.throw
 throws
 finally
 checked
 unchecked
         */

class ExceptionThrowKey /*extends ArithmeticException*/{
 public static void main(String args[]){

    int age=17;

  System.out.println("person age is : "+age);

    if(age<18)
       try{
        throw new ArithmeticException("hello");} 

       catch(ArithmeticException e)
          {
             System.out.println(e);    
          }


  System.out.println("normal program flow"); 

}
}