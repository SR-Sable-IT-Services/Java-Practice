

class HotelManagement {
    String hotelName;
    String fac;
    String branch;
    String add;
    int pin;
    long phone;

    HotelManagement(String hotelName, String fac, int hotelId, String branch, String add, int pin, long phone) {
        this.hotelName = hotelName;
        this.fac = fac;
        this.branch = branch;
        this.add = add;
        this.pin = pin;
        this.phone = phone;
    }

    void display() {
        System.out.println("Hotel Name: " + hotelName);
        System.out.println("Facility: " + fac);
        System.out.println("Branch: " + branch);
        System.out.println("Address: " + add);
        System.out.println("PIN: " + pin);
        System.out.println("Phone: " + phone);
    }
}

class ShowHotelDetails {
    public static void main(String[] args) {
        HotelManagement obj = new HotelManagement("Asp", "4 star", 1114, "Shivaji Nagar", "Bus Stop Mehkar, Mehkar, Buldhana", 443303, 9548671245L);
        obj.display();
    }
}
