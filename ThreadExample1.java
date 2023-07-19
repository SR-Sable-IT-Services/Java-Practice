//Extending the Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread using Thread class is running.");
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
