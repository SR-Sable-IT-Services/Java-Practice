class MultiThreadDemo extends Thread{
    
   public void run()
        {
            for(int i=1;i<=10;i++)
             {
               try{
               Thread.sleep(2000);
                   }
               catch(InterruptedException e){};
               System.out.println(i);
             }
        }
}

class ThreadDemo{

    public static void main(String args[]){
         
        MultiThreadDemo th=new MultiThreadDemo();
 
         th.start();   
}
}