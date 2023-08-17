import java.util.ArrayList;
import java.util.Collections;

public class Array_list {
public static void main(String[] args) {
	ArrayList<Integer> num = new ArrayList<>();
	
	num.add(12);
	num.add(15);
	num.add(14);
	num.add(125);
	num.add(18);
	
	Collections.reverse(num); //reverse function
	System.out.println(num);
}
}