package ch13;

import java.util.concurrent.*;

public class F_CallableTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> result2 = service.submit(() -> 30 + 11);
        try {
            System.out.println(result2.get()); // 41
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();
        }
    }
}

////////////////////////////////////////////
// Waiting for tasks to finish
class WaitingForTasksToFinish {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> result2 = service.submit(() -> 30 + 11);
        try {
            System.out.println(result2.get()); // 41
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();
        }

        service.awaitTermination(1, TimeUnit.MINUTES);
        // Check whether all tasks are finished
        if(service.isTerminated()) System.out.println("Finished!");
        else System.out.println("At least one task is still running");
    }
}