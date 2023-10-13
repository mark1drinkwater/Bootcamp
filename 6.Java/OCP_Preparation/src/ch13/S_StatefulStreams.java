package ch13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class S_StatefulStreams {
    /*
    Side effects can appear in parallel streams if your lambda expressions are stateful.
    A state-ful lambda expression is one whose result depends on any state that might change during the execution of a pipeline.
     */
    public static List<Integer> addValues(IntStream source) {
        var data = Collections.synchronizedList(new ArrayList<Integer>());
        source.filter(s -> s % 2 == 0)
                .forEach(i -> { data.add(i); } ); // STATEFUL: DO NOT DO THIS
        return data;
    }

    public static void main(String[] args) {
        var list = addValues(IntStream.range(1, 11));
        System.out.println(list);

        var list2 = addValues(IntStream.range(1, 11).parallel());
        System.out.println(list2);

        var list3 = addValuesBetter(IntStream.range(1, 11));
        System.out.println(list3);

        var list4 = addValuesBetter(IntStream.range(1, 11).parallel());
        System.out.println(list4);
        // Oh, no! Our results no longer match our input order!
    }

    public static List<Integer> addValuesBetter(IntStream source) {
        return source.filter(s -> s % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}
