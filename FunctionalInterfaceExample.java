@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using lambda expren to implt the calc method
        Calculator add = (a, b) -> a + b;
        System.out.println("Addition: " + add.calculate(5, 3));

        Calculator subtract = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtract.calculate(8, 4));

        // Using method reference to implt the calc method
        Calculator multiply = FunctionalInterfaceExample::multiplyNumbers;
        System.out.println("Multiplication: " + multiply.calculate(2, 6));
    }

    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }
}
