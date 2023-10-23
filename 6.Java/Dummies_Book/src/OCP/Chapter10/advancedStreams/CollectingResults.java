package OCP.Chapter10.advancedStreams;

import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingResults {
    public static void main(String[] args) {
        System.out.println("\nCollectors joining:");
        var ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result);

        System.out.println("\nCollectors avgInt");
        var ohMy2 = Stream.of("lions", "tigers", "bears");
        Double result2 = ohMy2.collect(Collectors.averagingInt(String::length));
        System.out.println(result2);

        // Converting to a Collection
        System.out.println("\nConverting to a TreeSet collection:");
        var ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result3 = ohMy3
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result3);

        // Collecting into Maps
        System.out.println("\nCollecting into Maps:");
        var ohMy4 = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy4.collect(
                Collectors.toMap(s -> s, String::length));
        System.out.println(map);

        // Try to reverse and use the length of the animal as the key and the name as the value
//        var ohMy5 = Stream.of("lions", "tigers", "bears");
//        Map<Integer, String> map2 = ohMy5.collect(Collectors.toMap(
//                String::length,
//                k -> k
//        )); // BAD
        // Because the length of lions and bears is 5
        // So we end up with 5 as a Duplicate key.

        // A better way to handle things:
        System.out.println("\nA better way to handle Mapping to prevent duplicate keys");
        var ohMy6 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map3 = ohMy6.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," +s2
        ));
        System.out.println(map3);
        System.out.println(map3.getClass());
    }
}
