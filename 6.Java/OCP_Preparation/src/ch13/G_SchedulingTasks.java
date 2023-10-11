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

            System.out.println(r2.get());
            System.out.println("Hi");
        } finally {
            service.shutdown();

        }
    }
}
