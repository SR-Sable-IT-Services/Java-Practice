class MathOperations {
    // MTD OVLD - Add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // MTD OVLD - Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // MTD OVRD - Calc the square of a no
    public double calculateSquare(double num) {
        return num * num;
    }
    
    // MTD OVRD - Calc the square root of a no
    public double calculateSquareRoot(double num) {
        return Math.sqrt(num);
    }
}

public class Polymor {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        
        // MTD OVLD - Add two integers
        int sum1 = mathOps.add(5, 10);
        System.out.println("Sum 1: " + sum1);
        
        // MTD OVLD - Add three integers
        int sum2 = mathOps.add(2, 4, 6);
        System.out.println("Sum 2: " + sum2);
        
        // MTD OVRD - Calc the square of a no
        double square = mathOps.calculateSquare(5.5);
        System.out.println("Square: " + square);
        
        // MTD OVRD - Calc the square root of a no
        double squareRoot = mathOps.calculateSquareRoot(25.0);
        System.out.println("Square Root: " + squareRoot);
    }
}
