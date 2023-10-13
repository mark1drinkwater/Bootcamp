package ch13;

import java.util.List;

public class Q_ParallelReductions {
    public static void main(String[] args) {
        /*
        Since order is not guaranteed with parallel streams, methods such as findAny()
        on a parallel stream may result in unexpected behavior.
         */
        System.out.println(List.of(1,2,3,4,5,6)
                .parallelStream()
                .findAny()
                .get());
        /*
        While neither the serial nor the parallel stream is
        guaranteed to return the first value, the serial stream often does
        */
        System.out.println(List.of(1,2,3,4,5,6)
                .stream()
                .findAny()
                .get());

        /*
        Creating Unordered Streams
        This method does not reorder the elements; it just tells the JVM that if an order-based stream
        operation is applied, the order can be ignored. For example, calling skip(5) on an unordered
        stream will skip any 5 elements, not necessarily the first 5 required on an ordered stream.
        */
        List.of(1,2,3,4,5,6).stream().unordered();
    }
}
