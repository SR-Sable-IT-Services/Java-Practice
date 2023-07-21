import java.util.*;

class ArrayListProgram{
  
   public static void main(String args[]){

    ArrayList<String> as=new ArrayList<>(5); //Growable in nature 
                                           //duplicates are allowed
                                           //non synchronized
                                           //not Thread Safe
                                           //insertion order is preserved
                                           //Null insertion is allowed
                                           //both homo and hedrogeneous objects are allowed
     as.add("ENP");
     as.add("Vishal");
     as.add("Sanjay");
     as.add("Amar");
     as.add("Rushikesh");

    System.out.println(as);  // printing ArrayList Object As it is.

     for(String s:as)       //Retrieving all the elements from the ArrayList object.
       {
          System.out.println(s);
       }

     as.remove("ENP"); // removing One object from the ArrayList directly.

     as.remove(1);   //   removing One ArrayList  object from given index. 

    System.out.println(as); //printing ArrayList Object As it is after all the operations.
      
}
}