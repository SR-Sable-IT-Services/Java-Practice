import java.util.*;

class VectorProgram{
  
   public static void main(String args[]){

    Vector<Float> vf=new Vector<>(5);      //Growable in nature 
                                           //duplicates are allowed
                                           //all methods are synchronized
                                           //Thread Safe
                                           //insertion order is preserved
                                           //Null insertion is allowed
                                           //both homo and hedrogeneous objects are allowed
     vf.add(12.123f);
     vf.add(123.1234f);
     vf.add(1234.12345f);
     vf.add(12345.123456f);
     vf.add(123456.1234567f);

    System.out.println(vf);  // printing ArrayList Object As it is.

     for(Float s:vf)       //Retrieving all the elements from the ArrayList object.
       {
          System.out.println(s);
       }

     vf.remove(123456.1234567f); // removing One object from the ArrayList directly.

     vf.remove(1);   //   removing One ArrayList  object from given index. 

    System.out.println(vf); //printing ArrayList Object As it is after all the operations.
      
}
}