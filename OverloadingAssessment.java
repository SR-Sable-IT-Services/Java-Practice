class OverloadingAssessment{
    int add(int a,int b)
      {
           return a+b;
      }

   double add(int a , double b, int c)
      {
          return a+b+c;
      }

    float add(int a , int b, int c,float d)
      {
          return a+b+c;
      }

  public static void main(String args[]){
   
   OverloadingAssessment obj=new OverloadingAssessment();
    System.out.println(obj.add(123,456));
    System.out.println(obj.add(123,456,789));
    System.out.println(obj.add(123,456,789,123.23f));
  
}    
}
