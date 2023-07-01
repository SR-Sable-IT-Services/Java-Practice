import java.util.Scanner;

public class MarksCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks: ");
        int marks = scanner.nextInt();

        if (marks >= 70) {
            System.out.println("Pass with distinction");
        } else if (marks >= 60) {
            System.out.println("Pass with first class");
        } else if (marks >= 50) {
            System.out.println("Pass with second class");
        } else if (marks >= 40) {
            System.out.println("Pass with third class");
        } else {
            System.out.println("Fail");
        }
    }
}
