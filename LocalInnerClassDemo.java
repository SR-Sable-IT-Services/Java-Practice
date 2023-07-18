/*  Java Local inner class */

class LocalOuterClass{

      void localMethod()
         {
 
            class LocalInnerClass{

                    void innerMethod()
                       {
                           System.out.println("I'm Local Inner class Method");
                       }
              }

    LocalInnerClass inObj=new LocalInnerClass();
        inObj.innerMethod();

         }

}

class LocalInnerClassDemo{

    public static void main(String args[]){

      LocalOuterClass obj=new LocalOuterClass();

      obj.localMethod();

}

}