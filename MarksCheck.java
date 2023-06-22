import java.util.Scanner;
class MarksCheck{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the grades between A to F to check marks ");
    char grade=sc.next().charAt(0);
   
    switch (grade){
    case 'A' : System.out.println("Congratulations you got marks 90 or above 90");
    break;
   
    case 'B' : System.out.println("you got marks Between 80-89");
    break;

    case 'C' : System.out.println("you got marks Between 70-79");
    break;

    case 'D' : System.out.println("you got marks Between 60-69");
    break;

    case 'F' : System.out.println("Sorry you got marks below 60 you failed the exam .");
    break;


}
}
}