public class ReverseNumber {
    public static void main(String[] args) {
        int number = 7458;
        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
    }
    
    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        
        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            number /= 10;
        }
        
        return reversedNumber;
    }
}
