package ch13;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class P_ParallelStreams {
    public static void main(String[] args) {
        // You can create a parallel stream from a collection or from a stream itself.
        Collection<Integer> collection = List.of(1, 2);
        Stream<Integer> p1 = collection.stream().parallel();
        Stream<Integer> p2 = collection.parallelStream();

        ///////////////////////////////////////////
        // Test doWork() with a serial stream, doWork() could be calling a database or reading a file.
        System.out.println("Serial Stream Test: ");
        long start = System.currentTimeMillis();
        List.of(1,2,3,4,5)
                .stream()
                .map(w -> doWork(w))
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        var timeTaken = (System.currentTimeMillis()-start)/1000;
        System.out.println("Time: " + timeTaken + " seconds");

        System.out.println();
        /////////////////////////////////////////////////////////////
        // Test doWork() with a parallel stream
        System.out.println("Parallel stream Test: ");
        start = System.currentTimeMillis();
        List.of(1,2,3,4,5)
                .parallelStream()
                .map(w -> doWork(w))
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        timeTaken = (System.currentTimeMillis()-start)/1000;
        System.out.println("Time: " + timeTaken + " seconds");
        System.out.println();

        //////////////////////////////////////////////////////////////
        // forEachOrdered()
        /*
        If your stream operation needs to guarantee ordering and you’re not sure if it is serial or
        parallel, you can replace it with one that uses forEachOrdered()
        While we’ve lost some of the performance gains of using a parallel stream, our map() operation can still take advantage of the parallel stream.
         */
        System.out.println("Parallel stream Test with forEachOrdered() ");
        start = System.currentTimeMillis();
        List.of(1,2,3,4,5)
                .parallelStream()
                .map(w -> doWork(w))
                .forEachOrdered(s -> System.out.print(s + " "));
        System.out.println();
        timeTaken = (System.currentTimeMillis()-start)/1000;
        System.out.println("Time: " + timeTaken + " seconds");
    }

    private static int doWork(int input) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
        return input;
    }
}
