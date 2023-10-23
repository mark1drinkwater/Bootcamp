package OCP.Chapter10.basicStreams;

import java.util.Optional;
import java.util.stream.Stream;

public class A {
    public static void main(String[] args) {
        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent()); // false

        Optional<String> notEmpty = Stream.of("a", "aaa").min((s1, s2) -> s1.length() - s2.length());

        if (notEmpty.isPresent()) {
            System.out.println(notEmpty.get());
        }

    }
}
