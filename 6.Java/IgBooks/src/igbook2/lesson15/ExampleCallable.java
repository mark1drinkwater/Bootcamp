package igbook2.lesson15;

import java.util.concurrent.Callable;

public class ExampleCallable implements Callable {
    // Callable interface defines a task submitted to an ExecutorService
    // Is similar in nature to Runnable but can
    // -- Return a result using generics
    // -- Throw a checked exception.

    private final String name;
    private final int len;
    private int sum = 0;

    public ExampleCallable(String name, int len) {
        this.name = name;
        this.len = len;
    }

    @Override
    public String call() throws Exception {
        for (int i = 0; i < len; i++) {
            System.out.println(name + ":" + i);
            sum += i;
        }
        return "sum: " + sum;
    }
}