package OCP.Chapter10.basicStreams;

import java.util.stream.Stream;

public class KillAllClones {
    public static void main(String[] args) {
        Stream<String> unique = Stream.of("Clone trooper", "Clone trooper", "Jedi", "Clone trooper", "Jedi");
        unique.distinct()
                .forEach(System.out::println);

    }
}
