package OCP.Chapter10.primitiveStreams;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamTest {
    public static void main(String[] args) {
        // Option 1
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.reduce(0, (s, n) -> s +n ));

        // Option 2
        Stream<Integer> stream2 = Stream.of(1, 2, 3);
        System.out.println(stream2.mapToInt(x -> x).sum() );

        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble()); // 2.0

        System.out.println("Random Generation");
        var random = DoubleStream.generate(Math::random);
        var fractions = DoubleStream.iterate(.5, d -> d / 2);

        random.limit(3).forEach(System.out::println);
        fractions.limit(3).forEach(System.out::println);

        IntStream count = IntStream.iterate(1, n -> n+1).limit(5);
        count.forEach(System.out::print);

        System.out.println("\n\nUsing IntStream.range");
        // Excludes the end value
        IntStream.range(1, 6).forEach(System.out::print);

        System.out.println("\nUsing IntStream.rangeClosed");
        // Includes the end value
        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::print);

        // ==================== Mapping =======================
        System.out.println("\n\n=====================Mapping======================");
        Stream.of("penguin", "fish").peek(System.out::println).mapToInt(String::length).forEach(System.out::println);

        // ==================================== Using Optional with Primitive Streams =====================
        System.out.println("\nUsing Optional with Primitive Streams");
        var stream1To10 = IntStream.rangeClosed(1, 10);
        OptionalDouble avgOD = stream1To10.average();
        avgOD.ifPresent(System.out::println);

        avgOD = OptionalDouble.empty();

        avgOD.ifPresent(System.out::println);
        System.out.println(avgOD.orElse((Double.NaN)));

        // ===================== Long Streams ==============
        System.out.println("\nLong Streams:");
        LongStream longs = LongStream.of(5, 10);
        long sum = longs.sum();
        System.out.println(sum);

        System.out.println("Infinite loooooop");
        DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
//        OptionalDouble min = doubles.min();


        // ====================== Summarizing Statistics =========================

    }


}
