public class LambdaExample {
    public static void main(String[] args) {
        // Define a lambda expression that impl the FunInte
        MyInterface myLambda = () -> {
            System.out.println("Hello, Lambda!");
        };
        
        // Call the method of the FunInte using the lambda expren
        myLambda.sayHello();
    }
}

// FunInte with a single abstract method
@FunctionalInterface
interface MyInterface {
    void sayHello();
}
