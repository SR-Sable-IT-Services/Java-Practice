public class AritExce{
public static void main(String[] args) {
try {
int x=10;
int y = 0;
int z = x/y;
System.out.println(z);
System.out.println(100);
} catch (ArithmeticException e) {
System.out.println(e);
e.printStackTrace();
}
System.out.println("Welcome");
}}