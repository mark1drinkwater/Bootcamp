package ch13;

public class A_CreatingThread {
    public static void main(String[] args) {
//        new Thread(() -> System.out.print("Hello")).start();
//        System.out.print("World");

        // If exam asked, what is the output of the following?
        // Answer: It is unknown until runtime.
        // Because,  Order of execution is not guaranteed
        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };

        System.out.println("begin");
        new Thread(printInventory).start();
        new Thread(printRecords).start();
        new Thread(printInventory).start();
        System.out.println("end");

    }
}

//////////////////////////////////////////////////////
class CallRunInsteadOfStart {
    public static void main(String[] args) {
        Runnable printInventory = () -> System.out.println("Printing zoo inventory");
        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        };

        // Calling run() on a Thread or Runnable does NOT start a new thread.
        // The code will compile but none will execute a task on a separate thread.
        // It runs sequentially, like a normal method would, nothing special
        System.out.println("begin");
        new Thread(printInventory).run();
        new Thread(printRecords).run();
        new Thread(printInventory).run();
        System.out.println("end");
    }

    // There are 2 ways to create a Thread
    // 1) Provide a Runnable object or lambda expression to the Thread constructor.
    // 2) Create a class that extends Thread and overrides the run() method.
}