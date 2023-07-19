//Using Java 8's lambda expressions and ExecutorService
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(() -> {
            System.out.println("Thread using ExecutorService is running.");
        });
        executorService.shutdown();
    }
}
