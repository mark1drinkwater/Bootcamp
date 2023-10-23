package OCP.Chapter10.basicStreams;

import java.util.List;
import java.util.stream.Stream;

public class FilterTest {
    public static void main(String[] args) {
        System.out.println("Filtering");
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m"))
                .forEach(System.out::println);

        System.out.println("Distinct values:");
        Stream<String> quackers = Stream.of("duck", "duck", "duck", "goose");
        quackers.distinct()
                .forEach(System.out::println);

        System.out.println("Iterate values:");
        Stream<Integer> iterateStream = Stream.iterate(1, n -> n + 1);
        // 1 2 3 4 5 6 7 8 9 10 till infinity
        iterateStream.skip(5)
        // - - - - - 6 7 8 9 10 11 12 till infinity
                .limit(2)
                // 6 7
                .forEach(System.out::println);

        // ============ Mapping =============
        System.out.println("Mapping!");
        Stream<String> primates = Stream.of("monkey", "gorilla", "bonobo");
        primates.map(x -> x.length() )
                .forEach(System.out::println);

        // ============ Flat Mapping ===========
//        System.out.println("\nFlat Mapping:");
//        List<String> zero = List.of();
//        var one = List.of("Bonobo");
//        var two = List.of("Mama Gorilla", "Baby Gorilla");
//        Stream<List<String>> animals = Stream.of(zero, one, two);
//
//        animals.flatMap(m -> m.stream())
//                .forEach(System.out::println);

        // ========= Concat ===============
        System.out.println("\nConcat:");
        var zero = Stream.of();
        var one = Stream.of("Bonobo");
        var two = Stream.of("Mama Gorilla", "Baby Gorilla");

        Stream<?> stream0And1 = Stream.concat(one, two);
        Stream<?> streamAll = Stream.concat(stream0And1, two);

        System.out.println("All 3 concatenated");
        streamAll.forEach(System.out::println);

//        Stream.concat(zeroCopy, twoCopy)
//                .forEach(System.out::println);
    }
}
