class MultiRunnableDemo implements Runnable{

     public void run()
        {
           for(int i=1;i<=5;i++)
             {
               try{
               Thread.sleep(2000);
                   }
               catch(InterruptedException e){};
               System.out.println(": "+i);
             }
        }
}

class RunnableDemo{

      public static void main(String args[]){

      MultiRunnableDemo rn=new MultiRunnableDemo();

      Thread thh=new Thread(rn);

      thh.start();
}
}