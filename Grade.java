import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character between 'a' and 'f': ");
        char grade = scanner.nextLine().charAt(0);

        if (grade == 'a' ) {
            System.out.println("Your percentage is between 90 or above: a");
        } else if (grade == 'b') {
            System.out.println("Your percentage is between 80-89: b");
        } else if (grade == 'c') {
            System.out.println("Your percentage is between 70-79: c");
        } else if (grade == 'd') {
            System.out.println("Your percentage is between 60-69: d");
        } else if (grade == 'e' || grade == 'f' ) {
            System.out.println("Your percentage is below 60: f");
        } else {
            System.out.println("Invalid input. Please enter a character between 'a' and 'f'.");
        }

        scanner.close();
    }
}
