/*define Hotel class with id, branch, addrss few 
more fields, create minimum 5 object initialize 
them using constructor.print the datial of hotel 
using display method.*/

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
        HotelManagement obj = new HotelManagement("UTM", "3 star", 1234, "Friends Colony", "New Friends Colony, Katol Road, Nagpur", 441501, 8459022351L);
        obj.display();
    }
}
