package OCP.Chapter10.basicStreams;

import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        Stream<Double> ranInfinity = Stream.generate(Math::random);
//        ranInfinity.forEach(System.out::println);

        Stream<Integer> oddNums = Stream.iterate(1, n -> n < 100, n -> n+2);
        oddNums.forEach(System.out::println);

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count());

    }
}
