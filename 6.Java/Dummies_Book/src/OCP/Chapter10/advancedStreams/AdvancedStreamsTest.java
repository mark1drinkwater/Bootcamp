package OCP.Chapter10.advancedStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AdvancedStreamsTest {
    public static void main(String[] args) {
        // Streams are lazily evaluated.
        System.out.println("Lazy evaluation and list acting as a reference in a stream");
        var cats = new ArrayList<>();
        cats.add("Annie");
        cats.add("Ripley");
        var stream= cats.stream();
        cats.add("KC");
        System.out.println(stream.count());

        System.out.println("Trial 1:");
        Stream<Integer> ints = Stream.of(111, 222, 3);
        Optional<Integer> opt = ints.max( (n1,n2) -> n1 - n2 );
        threeDigit(opt);

        System.out.println("Trial 2: (Nothing)");
        Stream<Integer> ints2 = Stream.of();
        Optional<Integer> opt2 = ints2.max( (n1,n2) -> n1 - n2 );
        threeDigit(opt2);

        System.out.println("Trial 3:");
        Optional<Integer> opt3 = Optional.of(322);
        threeDigit(opt3);

        System.out.println("\nWhat does that pesky optional do?");
        // Wow so you can call methods on an optional!
        Optional<String> optional = Optional.of("hello");
//        Optional<Integer> result = optional.map(String::length);
//        System.out.println(result);



    }

    private void runMethod() {
        Optional<String> optional = Optional.of("hello");
        // Does not compile
    }


    private static Optional<Integer> threeDigit2(Optional<String> optional) {
        return optional.map(n -> "" + n)
                .filter(s -> s.length() == 3)
                .stream()
                .map(s -> Integer.parseInt(s))
                .findAny();
    }

    private static void threeDigit(Optional<Integer> optional) {
        optional.map(n -> "" + n)
                .filter(s -> s.length() == 3)
                .ifPresent(System.out::println);
    }

}
