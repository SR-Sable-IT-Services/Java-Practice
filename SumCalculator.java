public class SumCalculator {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            sum += i;
        }

        System.out.println("The sum of numbers from 0 to 100 is: " + sum);
    }
}
