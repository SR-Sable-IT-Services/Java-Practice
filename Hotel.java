public class Hotel {
    private int id;
    private String name;
    private String address;
    private int rating;

    public Hotel(int id, String name, String address, int rating) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.rating = rating;
    }

    public void display() {
        System.out.println("Hotel Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Rating: " + rating);
    }

    public static void main(String[] args) {
        // Create hotel objects
        Hotel hotel1 = new Hotel(1, "Grand Hotel", "123 Main Street", 5);
        Hotel hotel2 = new Hotel(2, "Luxury Resort", "456 Park Avenue", 4);
        Hotel hotel3 = new Hotel(3, "Cozy Inn", "789 Elm Street", 3);

        // Display hotel details
        hotel1.display();
        System.out.println();
        hotel2.display();
        System.out.println();
        hotel3.display();
    }
}
