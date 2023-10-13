package ch13;

import java.util.concurrent.*;

public class G_SchedulingTasks {
    public static void main(String[] args) throws Exception, InterruptedException {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();


        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> "Monkey";

        try {
            ScheduledFuture<?> r1 = service.schedule(task1, 10, TimeUnit.SECONDS);
            ScheduledFuture<?> r2 = service.schedule(task2, 5, TimeUnit.SECONDS);

//            System.out.println(r2.get());
            System.out.println("Hi");
        } finally {
            service.shutdown();

        }
    }
}

// schedule a thread every 2 seconds
class Scheduler2 {
    public static void main(String[] args) throws Exception, InterruptedException {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();


        Runnable task1 = () -> System.out.println("Hello Zoo");
        Callable<String> task2 = () -> "Monkey";

        try {
            service.scheduleAtFixedRate(task1, 0, 2, TimeUnit.SECONDS);

            System.out.println("Hi");
        } finally {
            // Await termination is required to prevent the program from shutting down too early.
            // Before the threads have time to execute.
            service.awaitTermination(10, TimeUnit.SECONDS);
            service.shutdown();
        }
    }
}

///////////////////////////////////////////////////////
// ExecutorService & newCachedThreadPool()
class CachedThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();

        try {
            Runnable task1 = () -> System.out.println("Hello Zoo");
            Runnable task3 = () -> System.out.println("Hello Park");
            Callable<String> task2 = () -> {Thread.sleep(2000); return "Monkey"; };
            Callable<String> task4 = () -> "Zebra";
            service.submit(task1);
            System.out.println(service.submit(task2).get(4, TimeUnit.SECONDS));
            service.submit(task4);
            service.submit(task3).get();
        } catch (Exception e) {
            System.out.println("Sorry you ran out of time! " + e);
        } finally {
            service.shutdown();
        }
    }
}