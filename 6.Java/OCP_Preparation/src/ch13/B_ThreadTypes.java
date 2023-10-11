package ch13;

// Everything application is multithreaded because it includes system threads
// A system thread is created by the JVM and runs in the background of the application.
// E.g. garbage collection is managed by a system thread.
public class B_ThreadTypes {
    public static void pause() {
        try {
            // Wait for 10 seconds
            Thread.sleep(10_000);
        } catch (InterruptedException e) {}
        System.out.println("Thread finished!");
    }

    public static void main(String[] args) {
        // Create a thread
        var job = new Thread(() -> pause());
        // Start the thread
        System.out.println(job.getState());  // NEW
        job.start();
        System.out.println(job.getState()); // RUNNABLE
        // Even though the main method is done, the JVM will wait for the user thread
        // to finish before ending the program.
        System.out.println("Main method finished!");
        System.out.println(job.getState()); //RUNNABLE
    }
}

///////////////////////////////////////////////////////////
// Daemon thread won't prevent the JVM from closing down when the program finishes.
class DaemonThread {
    public static void pause() {
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {}
        System.out.println("Thread finished!");
    }

    public static void main(String[] args) {
        var job = new Thread(() -> pause());
        // setDaemon must be called before starting the job.
        // For the exam, remember that by default user-defined threads are not daemons
        // and the program will wait for them to finish.
        job.setDaemon(true);
        job.start();
        System.out.println(job.getState());
        System.out.println("Main method finished!");
    }
}