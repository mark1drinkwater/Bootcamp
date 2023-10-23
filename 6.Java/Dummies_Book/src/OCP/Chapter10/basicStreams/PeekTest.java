package OCP.Chapter10.basicStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PeekTest {
    public static void main(String[] args) {
//        var stream = Stream.of("black bear", "brown bear", "grizzly", "goat");
//        long count = stream.filter(s -> s.startsWith("g"))
//                .peek(System.out::println)
//                .count();
//        System.out.println(count);

        var numbers = new ArrayList<>();
        var letters = new ArrayList<>();

        letters.add('a');
        numbers.add(1);
        numbers.add(2);

//        System.out.println("List Size:");
//        Stream<List<?>> stream = Stream.of(numbers, letters);
//        stream
//                .peek(System.out::println)
//                .map(List::size)
//                .peek(System.out::println)
//                .forEach(s -> System.out.println(s));

        var stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(s -> s.startsWith("g"))
                .peek(System.out::println).count(); // grizzly
        System.out.println(count);

    }
}
