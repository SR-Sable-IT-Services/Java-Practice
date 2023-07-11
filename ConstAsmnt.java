class supCnstrctr{

    supCnstrctr()     // this super class constructor get automatically called by sub constructor.
                      // and it itself will call single para constructor of same class.
       {
          this(235.2354d);
          System.out.println("super class no para constructor");    
       } 

    supCnstrctr(double D)
       {
           this(546546.54454d ,56614.23488d);
          System.out.println("super class one para constructor");    
       } 

    supCnstrctr(double D , double D1)
       {
          System.out.println("super class two para constructor");    
       } 
  
    

}

class ConstAsmnt extends supCnstrctr{

     ConstAsmnt()
       {
          this(true);     // will call single para constructor.
         System.out.println("no para constructor");
       }

     ConstAsmnt(boolean A)
       {
         this(123.93f ,"hello");  // will call two para constructor.
         System.out.println("a para constructor");
       }

     ConstAsmnt(float B , String Str) // this constructor will call super class constructor. because
                                      // JVM autmatically will add super() keyword which then call a no para super class constructor
       {
          //super();
          //this();           we can't use bothe super() and this () keyword in same constructor.
         System.out.println("two para constructor");
       }

   public static void main(String args[]){

    ConstAsmnt Obj=new ConstAsmnt();  //it will first call no para constructor of class 'ConstAsmnt'.
                                      //and then all the contructor get called as execution flow .

}
 
}