package OCP.Chapter10.basicStreams;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortTest {
    public static void main(String[] args) {
        System.out.println("Sorting");
        Stream<String> s = Stream.of("brown bear", "grizzly");
        s.sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        /// Works
        // Sort wants a Comparator NOT a lambda function
        s.sorted(Comparator.reverseOrder());
        // This returns () -> Comparator.reverseOrder()
        // Which is a lambda function, a Supplier<Comparator>
        // s.sorted(Comparator::reverseOrder);


    }
}
