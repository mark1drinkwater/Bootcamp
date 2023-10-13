package ch13;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class K_Lock {
    static int count = 1;

    public static void main(String[] args) throws Exception {
        Lock lock = new ReentrantLock();

        new Thread(() -> printHello(lock)).start();

        if (lock.tryLock(2, TimeUnit.SECONDS)) {
            try {
                System.out.println("In try lock: " + count);
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }

    public static void printHello(Lock lock) {
        try {
            lock.lock();
            Thread.sleep(3000);
            System.out.println("In printHello " + ++count);
            System.out.println("Hello");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}

////////////////////////////////////////
/// Applying the Same lock twice
class LockTwice {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        if(lock.tryLock())
        {
            try {
                lock.lock();
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
            /*
            The thread obtains the lock twice but releases it only once. You can verify this by
            spawning a new thread after this code runs that attempts to obtain a lock. The following
            prints false:
            It is critical that you release a lock the same number of times it is acquired! For calls with
            tryLock(), you need to call unlock() only if the method returned true.
             */
            new Thread(() -> System.out.print(lock.tryLock())).start();
        }
    }
}