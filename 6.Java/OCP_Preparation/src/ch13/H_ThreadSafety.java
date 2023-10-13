package ch13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class H_ThreadSafety {
}

class SheepManager {
    private int sheepCount = 0;
//    private volatile int sheepCount = 0; Volatile doesn't work

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++) {
                service.submit(() -> manager.incrementAndReport());
            }
        } finally {
            service.shutdown();
        }
    }

    void incrementAndReport() {
        System.out.print((++sheepCount) + " ");
    }
}

///////////////////////////////////////////////////////
// With Atomic Integers
// What's different with this one?
// Unlike previous samples, numbers 1 through 10 will always be printed.
// although the order is still not guaranteed.
// Atomic classes ensures the data is consistent between workers and that no values are lost due to concurrent modifications.
class SheepManagerAtomic {
    private AtomicInteger sheepCount = new AtomicInteger();
//    private volatile int sheepCount = 0; Volatile doesn't work

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            SheepManagerAtomic manager = new SheepManagerAtomic();
            for (int i = 0; i < 10; i++) {
                service.submit(() -> manager.incrementAndReport());
            }
        } finally {
            service.shutdown();
        }
    }

    private void incrementAndReport() {
        System.out.print(sheepCount.incrementAndGet() + " ");
    }
}