public class NullPointerExcep {
    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length(); // Attempt to access length of null reference
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

