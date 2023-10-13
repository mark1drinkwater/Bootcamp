package ch13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class I_SynchronizedBlocks {
}

class SheepManagerSynchronized {
    private static int sheepCount = 0;

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(20);
        try {
            var manager = new SheepManagerSynchronized();
            for (int i = 0; i < 10; i++) {
                service.submit(() -> manager.incrementAndReport());
            }
        } finally {
            service.shutdown();
        }
    }
    // All of these methods work, just different ways to do it.
    // But all work similarly.

    private void incrementAndReport() {
        synchronized (this) {
            System.out.print((++sheepCount) + " ");
        }
    }

    // How to synchronize the whole method.
//    synchronized private void incrementAndReport() {
//        synchronized (this) {
//            System.out.print((++sheepCount) + " ");
//        }
//    }

    // Synchronize the class
//    synchronized static private void incrementAndReport() {
//        synchronized (SheepManager.class) {
//            System.out.print((++sheepCount) + " ");
//        }
//    }

    // Synchronize static method
//    synchronized private void incrementAndReport() {
//            System.out.print((++sheepCount) + " ");
//    }
}
