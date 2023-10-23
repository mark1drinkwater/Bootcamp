package OCP.Chapter10.basicStreams;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TerminalStreamOperations {
    public static void main(String[] args) {
        List numbers = List.of(4, 5, 9, 1, 18, 100, 0);
        long count = numbers.stream().count(); // 7
        System.out.println("Number of elements: " + count);

        System.out.println("\nSmallest word:");
        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min( (s1, s2) -> s1.length()-s2.length() );
        min.ifPresent(System.out::println);

        System.out.println("\nLongest word:");
        Stream<String> ss = Stream.of("monkey", "ape", "bonobo");
        Optional<String> max = ss.max( (s1, s2) -> s1.length() - s2.length() );
        max.ifPresent(System.out::println);

        Stream<String> s2 = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate( () -> "chimp" );


        System.out.println("\nEnding an infinite stream with findAny");
        s2.findAny().ifPresent(x -> System.out.println(x));
        // findAny is able to end even an infinite stream.
        infinite.findAny().ifPresent(System.out::println);

        System.out.println("\nMatching:");

        var isLetters = List.of("monkey", "2", "chimp");
        // Then we have an infinite stream that generates chimp
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        // monkey --> m  o  n  k  e  y

        System.out.println( isLetters.stream().anyMatch(pred) ); // true
        System.out.println( isLetters.stream().allMatch(pred) ); // false
        System.out.println( isLetters.stream().noneMatch(pred) ); // false
//        System.out.println(infinite.anyMatch(pred)); // true

        // Let's try to kill our program!
        // System.out.println(infinite.allMatch(pred)); // true

        System.out.println("\nFor each loop (stream): ");
        isLetters.stream().forEach(  x -> System.out.println(x)  );
        System.out.println("\nFor each loop (collection) ");
        isLetters.forEach(x -> System.out.println(x));

        ///////////////////////////////////////////
        // Reduction


    }
}
