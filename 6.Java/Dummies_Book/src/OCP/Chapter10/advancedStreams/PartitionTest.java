package OCP.Chapter10.advancedStreams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionTest {
    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map1 = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println("To a list with 5 length:");
        System.out.println(map1);

        var ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map2 = ohMy2.collect(
                Collectors.partitioningBy(s -> s.length() <= 7)
        );
        System.out.println("To a list with 7 length:");
        System.out.println(map2);

        var ohMy3 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map3 = ohMy3.collect(
                Collectors.partitioningBy(
                        s -> s.length() <= 7,
                        Collectors.toSet()
                )
        );
        System.out.println("To a Set:");
        System.out.println(map3);

        ////// Group by again
        // group by the length of the animal name to see how many of each length we have.
        var ohMy4 = Stream.of("lions", "tigers", "bears", "ant", "rat", "cat", "elephant");
        Map<Integer, Long> map4 = ohMy4.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.counting()
                )
        );
        System.out.println("Group by length of animal name, to show the count of each group.");
        System.out.println(map4);
    }
}
