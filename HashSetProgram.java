import java.util.HashSet;

public class HashSetProgram {
    public static void main(String[] args) {
        // Creating a HashSet of integers
        HashSet<Integer> numbers = new HashSet<>();

        // Adding elements to the HashSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // HashSet does not allow duplicate elements
        numbers.add(30); // This will not be added

        // Iterating through the HashSet using for-each loop
        System.out.println("HashSet elements:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
