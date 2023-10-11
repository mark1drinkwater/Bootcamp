package ch13;

import java.util.concurrent.*;

public class E_SubmittingTasks {
    private static int counter = 0;

    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            Future<?> result = service.submit(() -> {
                for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
                    counter++;
                }
            });

            System.out.println("Starting the task.");
            // It waits 10 seconds for the task to complete.
            // If it takes longer than that it throws a TimeoutException
            result.get(10, TimeUnit.MILLISECONDS); // Returns null for Runnable
            System.out.println("Reached in time.");
        } catch (Exception e) {
            System.out.println("Not reached in time");
        } finally {
            service.shutdown();
        }
    }
}