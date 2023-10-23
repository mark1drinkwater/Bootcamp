package OCP.Chapter10.advancedStreams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingTest {
    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length)
        );
        System.out.println(map);

        var ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map2 = ohMy2.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.toSet()
                )
        );
        System.out.println("This time with a set:");
        System.out.println(map2);

        var ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map3 = ohMy3.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toSet()
                )
        );
        System.out.println("With Tree Map:");
        System.out.println(map3);

        var ohMy4 = Stream.of("lions", "tigers", "rhinoceros", "bears", "ant");
        TreeMap<Integer, List<String>> map4 = ohMy4.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toList()
                )
        );
        System.out.println("Keep it as a List this time:");
        System.out.println(map4);
    }
}
