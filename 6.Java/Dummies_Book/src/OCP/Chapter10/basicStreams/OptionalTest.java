package OCP.Chapter10.basicStreams;

import java.util.Optional;

public class OptionalTest {
    public static Optional<Double> average(int... scores) {
        int sum = 0;
        for (int score : scores)
            sum += score;

        Double avg = (double) sum / scores.length;

        if (scores.length == 0)
            avg = null;

//        Optional o = (avg == null) ? Optional.empty() : Optional.of(avg);
        Optional o = Optional.ofNullable(avg);
        return o;
    }

    public static void main(String[] args) {
        System.out.println(average(0, 100));
        System.out.println(average());

        System.out.println("Working with doubles:");
        Optional<Double> avg = average();
        if (avg.isPresent())
            System.out.println(avg.get());
        else System.out.println("No values inside.");

        Optional<Double> myAvg = average(1, 5);
        myAvg.ifPresent(System.out::println );

        Optional<Double> empty = average();
        System.out.println(empty.orElse(Double.NaN)); // return value
        System.out.println(empty.orElseGet(() -> Math.random())); // Supplier
        System.out.println(empty.orElseThrow());
        // If you want to specify your own exception, it throws if for you.
        System.out.println(empty.orElseThrow( ()-> new IllegalStateException() ));;

    }
}
