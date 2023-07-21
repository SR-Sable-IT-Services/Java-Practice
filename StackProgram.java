import java.util.*;

class StackProgram{
  
   public static void main(String args[]){

    Stack<Double> sd=new Stack<>();        //Growable in nature 
                                           //duplicates are allowed
       `                                   //all methods are synchronized
                                           //Thread Safe
                                           //insertion order is preserved
                                           //Null insertion is allowed
                                           //both homo and hedrogeneous objects are allowed
                                           //it perform LIFO operation
     sd.push(12.123);
     sd.push(123.1234);
     sd.push(1234.12345);
     sd.push(12345.123456);
     sd.push(123456.123456);

    System.out.println(sd);     // printing ArrayList Object As it is.
 
    System.out.println();   

     for(Double s:sd)           //Retrieving all the elements from the ArrayList object.
       {
          System.out.println(s);
       }

     System.out.println();   

     System.out.println(sd.pop());   //  it will print the Last inserted Element and will remove it also.

     System.out.println(); 

     System.out.println(sd);          //printing ArrayList Object As it is after all the operations.

     System.out.println(); 

     System.out.println(sd.peek());   // it will print the Last inserted Element because of the LiFo Structure.
      
}
}