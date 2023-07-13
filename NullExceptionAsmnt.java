class NullExceptionAsmnt{
 public static void main(String arg[]){

     String str=null;
     String str1="null";
     int a=12;
     int b=12;

   try{
     boolean str2=str.equals(str1);
      }

   catch(NullPointerException e)
      {
          System.out.println(e);
      } 

   catch(Exception ex)
      {
        System.out.println(ex);
      }

    
}
}