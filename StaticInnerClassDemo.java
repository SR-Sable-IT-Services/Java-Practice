class StaticOuterClass{

       static class StaticInnerClass{
                
         void show()
            {
               System.out.println("I'm static inner class");
            }

    }

}

class StaticInnerClassDemo{

    public static void main(String args[]){

        StaticOuterClass.StaticInnerClass obj=new StaticOuterClass.StaticInnerClass();

           obj.show();
 
}

}