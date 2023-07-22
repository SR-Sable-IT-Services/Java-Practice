public class DemoException1 
{

	public static void main(String[] args) 
	{
        Scanner s= new Scanner(System.in);
		try 
		{
		 System.out.println("Enter the number of employee work on this project :");
		 int n = s.nextInt();// exception raised when input other than intger value 
		 int a = 200/n;//Exception when n = 0
		 System.out.println("Each Employee will work for :"+a+" hrs");
		}//Try block will hold the statement which are going to raised the exception
//=>when the exception is raised in 'try' block,then one object is created forException_type_class 
		//and the object reference is thrown onto catch block.
		
		catch(InputMismatchException ime)
		{
		System.out.println("Enter only integer value...");
		System.out.println("DEtails :"+ime.getMessage());
		System.out.println("Exception_Type_Class :"+ime.getClass());
		}
//getMessage() method is from 'Throwable' class and which is used to display the msg from the Object.
//=>getClass() method is from 'java.lang.Object' class and which is used to display the class_name of an object.

		catch(ArithmeticException ob1)
		{
		System.out.println("Enter only Non-Zero value....");
		//System.out.println("Details :"+ob1.getMessage());
		ob1.printStackTrace();
//=>printStackTrace() method is  from 'Throwable' class and which is used to display the complete
//details of exception like Exception_type_class,message,method_name and Line_no.

		}
		//'catch' block will hold the object reference and display the required messages.
		
		finally
		{
			s.close();
		}//finally for resource closing // it is not mandetory 
// 'finally' block is part of exception handling process,but executed independently
//without depending on exception.

	}
}
