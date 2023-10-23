package OCP.Chapter10.primitiveStreams;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class SummarizingStatistics {
    public static void main(String[] args) {
        var nums1 = IntStream.of(1, -4, 2, 5, 10, 0);
        var nums2 = IntStream.of(1, -4, 2, 5, 10, 0);

        var empty = IntStream.of();

//        System.out.println(max(nums));
//        System.out.println(max(empty));
        System.out.println("The range of values is: " + range(nums1));
        System.out.println("The total is: " + total(nums2));

    }
    private static int max(IntStream ints) {
        OptionalInt optional = ints.max();
        return optional.orElseThrow(RuntimeException::new);
    }

    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax() - stats.getMin();
    }
    private static double total (IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0)
            throw new RuntimeException();
        return stats.getSum();
    }
}
