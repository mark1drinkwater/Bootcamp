package igbook2.lesson15;

import java.util.concurrent.*;

public class ExecutorCallableExample {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(4);
        Future<String> f1 = es.submit(new ExampleCallable("one", 10));
        Future<String> f2 = es.submit(new ExampleCallable("two", 10));

        try {
//            es.shutdown();
            // Wait 5 seconds for the tasks to complete
//            es.awaitTermination(5, TimeUnit.SECONDS);
            // Get the results of task f1 and f2

            int i = 1;
            i++;

            try {
                f1.get(1, TimeUnit.SECONDS);
            } catch (Exception e) {
                System.out.println("Sorry your CPU is too slow!!");
                throw new RuntimeException();
            }


//            String result1 = f1.get();
//            System.out.println("Result of one: " + result1);
            String result2 = f2.get();
            System.out.println("Result of two: " + result2);
        } catch (ExecutionException | InterruptedException e) {
            System.out.println("Exception: " + e);
        }

    }
}
