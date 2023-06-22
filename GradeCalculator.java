import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character between 'a' and 'f': ");
        char grade = scanner.next().charAt(0);
        
        String message;

        switch (grade) {
            case 'a':
            case 'A':
                message = "Your percentage is between 90 or above: A";
                break;
            case 'b':
            case 'B':
                message = "Your percentage is between 80-89: B";
                break;
            case 'c':
            case 'C':
                message = "Your percentage is between 70-79: C";
                break;
            case 'd':
            case 'D':
                message = "Your percentage is between 60-69: D";
                break;
            case 'e':
            case 'E':
            case 'f':
            case 'F':
                message = "Your percentage is below 60: F";
                break;
            default:
                message = "Invalid input!";
        }

        System.out.println(message);
    }
}