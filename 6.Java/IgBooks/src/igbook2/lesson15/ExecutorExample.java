package igbook2.lesson15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(new ExampleRunnable("one"));
        es.execute(new ExampleRunnable("two"));
        // Shutdown es important because its threats are nondaemon threads that will keep your JVM from shutting down.
        es.shutdown();

        // If you want to wait for Callables to finish
        try {
            es.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println("Stopped waiting early.");
        }


    }
}
