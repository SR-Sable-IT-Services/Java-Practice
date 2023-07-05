import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobile_Valid {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your moblie Number");
	String str = scan.next();
	int count = 0;
	Pattern p = Pattern.compile("[0-6][0-9]{10}");
	Matcher m = p.matcher(str);
	while(m.find()) {
		count++;
	}if(count!=0 || str.length()<10) {
		System.out.println("Error");
	}else if(str.length()==10) {
		System.out.println("Input Accepted");
	}
	}
}
