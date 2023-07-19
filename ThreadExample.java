public class ThreadExample {

    public static void main(String[] args) {
        // Creating a new thread
        Thread thread = new MyThread();

        // Starting the thread
        thread.start();

        // Main thread continues its execution
        System.out.println("Main thread is running.");
    }

    // Custom thread class
    static class MyThread extends Thread {
        @Override
        public void run() {
            // Code to be executed by the thread
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread is running: " + i);

                try {
                    Thread.sleep(1000); // Pause the thread for 1 second
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted.");
                }
            }
        }
    }
}
