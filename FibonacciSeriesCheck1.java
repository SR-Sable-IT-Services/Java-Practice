/*Write The Programs to print the  Fibonacci series still given number.*/
  
class  FibonacciSeriesCheck{
public static void main(String args[]){
      int a=0;
      int b=1;
      int limit=10;
      
        System.out.print(a+", "+b);

   for (int i=2;i<=limit;i++)
     {
        int c=a+b;
        System.out.print(", "+c);
        a=b;
        b=c;
     }

}
}