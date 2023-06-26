package assignment;
import java.util.Scanner;
public class MarkGradeCheck {
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the student Marks :");
		int mark = s.nextInt();
		if(mark>=90)
		{
			System.out.println("grade = A");
		}else if(mark>=80)
		{
			System.out.println("grade = B");
		}else if(mark>=70)
		{
			System.out.println("grade = C");
		}else if(mark>=60)
		{
			System.out.println("grade = D");
		}else
		{
			System.out.println("Fail");
		}
	}
}