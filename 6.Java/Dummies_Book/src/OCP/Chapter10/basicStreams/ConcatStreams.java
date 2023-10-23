package OCP.Chapter10.basicStreams;

import java.util.stream.Stream;

public class ConcatStreams {
    public static void main(String[] args) {
        var one = Stream.of("Bonobo");
        var two = Stream.of("Mama Gorilla", "Baby Gorilla");
        Stream.concat(one, two)
                .forEach(System.out::println);

//        String
    }
}
