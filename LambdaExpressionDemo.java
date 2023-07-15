/* assessment 15-07-2023

   write an functional interface and create object for it using anonymous class.
 * write an functional interface and create object for it using lambda expression.
*/
@FunctionalInterface
interface FunctionalDemo {  
    int mul(int a, int b); // abstract method

    String toString(); //  toString method of Object class

    int hashCode();  //   hashCode method of Object Class

    default void dmeth() {  // default method
        pmeth();
    }

    private void pmeth() {   // private method 
        System.out.println("private method");
    }

    static void smeth() {  // static method
        System.out.println("Static method");
    }
}

class  LambdaExpressionDemo{
    public static void main(String args[]) {
        FunctionalDemo obj =
                 (int a, int b)-> {
                return a * b;
            };

        System.out.println(obj.mul(3, 12));

        obj.dmeth();
    }
}
