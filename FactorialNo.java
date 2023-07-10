public class FactorialNo {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num : ");
        
         int num=s.nextInt();
		 int factorial=1;
		 for(int i=num;i>0;i--)
		 {
			 factorial  = factorial*i;		//5x4x3x2x1	 
		 }
		 System.out.println(factorial); 
	}

}