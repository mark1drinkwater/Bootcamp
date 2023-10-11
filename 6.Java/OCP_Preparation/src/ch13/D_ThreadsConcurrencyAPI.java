package ch13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// java.util.concurrent handles the complicated work of managing theads for you
// When writing multi-threaded programs in practice is better to use the Concurrency API or other mth SDK rather than work with the Thread objects directly.
public class D_ThreadsConcurrencyAPI {
    public static void main(String[] args) {
        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };

        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            System.out.println("begin");
            service.execute(printInventory);
            service.execute(printRecords);
            service.execute(printInventory);
            System.out.println("end");
        } finally {
            service.shutdown();
        }
    }
}
