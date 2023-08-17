import java.util.TreeSet;

public class TreeSetProgram {
    public static void main(String[] args) {
        // Creating a TreeSet of strings
        TreeSet<String> names = new TreeSet<>();

        // Adding elements to the TreeSet
        names.add("Sanjay");
        names.add("Vishal");
        names.add("Rushi");
        names.add("Amar");

        // TreeSet stores elements in ascending order
        System.out.println("TreeSet elements:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
