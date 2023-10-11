package ch13;

// Polling is the process of intermittently checking data at some fixed interval.
public class C_PollingSleep {
}

class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) counter++;
        });
        System.out.println(myThread.getState()); // NEW
        myThread.start();
        System.out.println(myThread.getState()); // RUNNABLE

        while (counter < 1_000_000) {
            System.out.println(myThread.getState());
            System.out.println("Not reached yet");
            try {
                // While 1 second may seem like a small amount
                // We've freed the CPU to do other work instead of checking the counter infinitely within a loop
                // Notice: the main() thread alternates between TIMED_WAITING and RUNNABLE when sleep() is entered and exited, respectively.
                Thread.sleep(1); // 1 SECOND
                System.out.println(myThread.getState());
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
        System.out.println(myThread.getState());

        System.out.println("Reached: " + counter);
    }
}

/////////////////////////////////////////////////
// This improved version includes both sleep() to avoid tying up the CPU
// & interrupt() so the thread's work ends without delaying the program.
class CheckResultsWithSleepAndInterrupt {
    private static int counter = 0;
    public static void main(String[] a) {
        final var mainThread = Thread.currentThread();

        // Separate Thread
        new Thread(() -> {
            for(int i = 0; i < 1_000_000; i++) counter++;
            mainThread.interrupt();
        }).start();

        // Main Thread
        while(counter < 1_000_000) {
            System.out.println("Not reached yet");
            try {
                Thread.sleep(1_000); // 1 SECOND
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
        System.out.println("Reached: "+counter);
    }
}