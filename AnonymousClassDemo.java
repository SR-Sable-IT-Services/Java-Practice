/* Java Anonymous inner class program */


abstract class OuterClass2{
 
      float ft=123.212f;

      abstract void display();
}

class AnonymousClassDemo{

     public static void main(String args[]){

       OuterClass2 obj=new OuterClass2()
          {
              void display()
                 {
                    System.out.println( "I'm Anonymous class method ");
                 };
          };

       obj.display();
}

}

