/*  Assessment 14/07/2023
 try
 catch
.throw
 throws
 finally
 checked
 unchecked
         */

class ExplicitException extends ArithmeticException{
    public ExplicitException(String msg){super(msg);}
}

class UserExceptionThrowKey{
 public static void main(String args[]){

    String str="";   

  System.out.println("given String is : "+str);
  try{

     if (str.equals(""))
        throw new ExplicitException("hello");
      
      } 

       catch(ExplicitException e)
          {
            System.out.println(e);
          }


  System.out.println("normal program flow"); 

}
}