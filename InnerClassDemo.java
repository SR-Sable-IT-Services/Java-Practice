/* Inner class Demo Program */

class OuterClass{

   private String str="Field Member";

   void say(){System.out.println("I'm outer class method ");}

     class InnerClass{

             void display()
                   {
                      System.out.println("I'm inner class method and "+str);
                     
                      say();
                   }
             
        
       }
}

class InnerClassDemo{

    public static void main(String args[]){

      OuterClass obj=new OuterClass();

      OuterClass.InnerClass in=obj.new InnerClass();

      in.display();        
}
}