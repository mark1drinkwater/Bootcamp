package OCP.Chapter10.advancedStreams;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class MappingTest {
    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Optional<Character>> map1 = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(
                                s -> s.charAt(0),
                                Collectors.minBy((a, b) -> a - b)
                        )
                )
        );
        System.out.println(map1);

        var ohMy2 = Stream.of("lions", "tigers", "bears");
        // Static import usage:
        Map<Integer, Optional<Character>> map2 = ohMy2.collect(
                groupingBy(
                        String::length,
                        mapping(
                                s -> s.charAt(0),
                                Collectors.minBy((a, b) -> a - b)
                        )
                )
        );
        System.out.println(map2);
    }
}
