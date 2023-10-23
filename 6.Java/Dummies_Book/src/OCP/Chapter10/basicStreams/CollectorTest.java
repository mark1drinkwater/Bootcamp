package OCP.Chapter10.basicStreams;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorTest {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("w", "o", "l", "f");

        TreeSet<String> set = stream.collect(
                TreeSet::new,
                TreeSet::add,
                TreeSet::addAll
        );
        System.out.println("Creating a tree set the manual way:");
        System.out.println(set);
        System.out.println("===============Built-in Collection Operators===================");

        // This code is equivalent but shorter than the above code.
        System.out.println("Tree Set:");
        Stream<String> wolf = Stream.of("w", "o", "l", "f");
        // We are saving a stream to a collection!
        TreeSet<String> set2 = wolf.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set2); // [f, l, o, w]

        // If we don't specify the exact collection like this example:
        // toSet() will likely return a HashSet but it might not.
        // Whereas before we specified we want to be a TreeSet.
        System.out.println("Most likely a HashSet but don't count on it:");
        Stream<String> wolf2 = Stream.of("w", "o", "l", "f");
        Set<String> unkownSet = wolf2.collect(Collectors.toSet());
        System.out.println(unkownSet);


    }
}
