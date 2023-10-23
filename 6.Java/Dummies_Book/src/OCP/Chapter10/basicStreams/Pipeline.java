package OCP.Chapter10.basicStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pipeline {
    public static void main(String[] args) {
//        var list = List.of("Toby", "Anna", "Leroy", "Alex");
//        list.stream()
//                .filter(n -> n.length() == 4)
//                .sorted()
//                .limit(2)
//                .forEach(System.out::println);
//
//        Stream.generate(() -> "Elsa")
//                .filter(n -> n.length() == 4)
//                .limit(2)
//                .sorted()
//                .forEach(System.out::println);
//
//        // Hangs too
//        Stream.generate(() -> "Olaf Lazisson")
//                .filter(n -> n.length() == 4)
//                .limit(2)
//                .sorted()
//                .forEach(System.out::println);

        // Chaining two pipelines together
        long count = Stream.of("goldfish", "finch") // start of 1st pipeline
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList()) // terminal operation
                .stream() // source of pipeline
                .count(); // terminal operation
        System.out.println(count);

        // Can be re-written as
        List<String> fish = Stream.of("goldfish", "finch")
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());

        long count2 = fish
                .stream()
                .count();
        System.out.println(count2);
    }
}
