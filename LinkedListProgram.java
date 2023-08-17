import java.util.LinkedList;

public class LinkedListProgram {
    public static void main(String[] args) {
        // Creating a LinkedList of strings
        LinkedList<String> names = new LinkedList<>();

        // Adding elements to the LinkedList
        names.add("Sanjay");
        names.add("Vishal");
        names.add("Rushi");
        names.add("Amar");

        // Accessing elements using get() method
        System.out.println("Element at index 2: " + names.get(2));

        // Updating an element at a specific index
        names.set(1, "Bill");

        // Removing an element from the LinkedList
        names.remove(3);

        // Iterating through the LinkedList using for-each loop
        System.out.println("LinkedList elements:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
