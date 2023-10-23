package OCP.Chapter10.basicStreams;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ReductionTest {
    public static void main(String[] args) {
        // Reduction is when we go through an entire collection and return a value.
        var array = new String[] { "w", "o", "l", "f" };
        var result = "";

        for (var s : array) {
            result = result + s;
        }
        System.out.println("Reduction with an array.");
        System.out.println(result); // wolf


        // How to do the above, using streams
        Stream<String> stream = Stream.of("w", "o", "l", "f");
//        String word = stream.reduce("", (s,c) -> s + c );

        String word = stream.reduce("", String::concat);

        System.out.println("Reduction with a stream.");
        System.out.println(word); // wolf

        ///////////
        System.out.println("Multiply integers in a stream");
        Stream<Integer> ints = Stream.of(2, 4, 8, 10);
        // 2 * 4 * 8 * 10 = 640
        // a for accumulator (previous value)
        // i is the integer, we're working with

//        int a = 1;
//        a = a * 2;
//        a = a * 4;
//        a = a * 8;
//        a = a * 10;
        int times = ints.reduce(1, (a, i) -> a * i );
        System.out.println(times);

        System.out.println("3 Return types of the reduce method:");

        BinaryOperator<Integer>  op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);

        empty.reduce(op).ifPresent(System.out::println); // no output
        oneElement.reduce(op).ifPresent(System.out::println); // 3
        threeElements.reduce(op).ifPresent(System.out::println); // 3*5*6= 90

        ///////////////////////////////////////
        System.out.println("Multiple reductions aka lambda functions in one function! WOW");
        Stream<String> wolfStream = Stream.of("w", "o", "l", "f!");

        int length = wolfStream.reduce(0, (i, s) -> i+s.length(), (a, b) -> a + b );
        System.out.println("Length of the string: " + length);

        /// Explanation of a combiner ----------------
        // Aidan
        /// "abcde"   5
        /// "abcdefghijklmnopqrstuvwxyz" 26
        // Subtotal: 31

        // Mark
        /// "abcdefghij" 10
        /// "abc" 3
        // Subtotal: 13

        // Total = Aidan + Mark = 44;
    }
}
