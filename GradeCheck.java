/*Write a Java program, define student's score as variable and prints their corresponding grade according to the following scale:

90 or above: A
80-89: B
70-79: C
60-69: D
Below 60: F*/


import java.util.Scanner;
class GradeCheck{
public static void main(String arg[]){

     Scanner sc=new Scanner(System.in);
   
          System.out.println("Enter the Score to check Grade of a student");

     int score =sc.nextInt();

    if(score>=90)
       {
          System.out.println("Grade : A"); 
       }
    else if(score>=80 && score<89)
       {
          System.out.println("Grade : B");
       }
    else if(score>=70 && score<79)
       {
          System.out.println("Grade : C");
       }
    else if(score>=60 && score<69)
       {
          System.out.println("Grade : D");
       }
    else if(score<60)
       {
          System.out.println("Fail");
       }
    else
      {
          System.out.println("please enter the valid Score between 1 to 100");
      }
}
}