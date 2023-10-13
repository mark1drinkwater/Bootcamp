package ch13;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class R_StreamReduce {
    public static void main(String[] args) {
        // Combining Results with reduce()
        System.out.println(List.of(1,2,3,4,5,6)
                .parallelStream()
                .reduce(0, (a, b) -> (a - b))); // PROBLEMATIC ACCUMULATOR

        System.out.println(List.of("w","o","l","f")
                .parallelStream()
                .reduce("X", String::concat)); // XwXoXlXf

        // Combining Results with collect()
        // The collect has a 3-argument version, that takes a accumulator, combiner and supplier.
        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        // Skip means sorted
        // You should use a concurrent collection to combine the results, ensuring that the results
        // of concurrent threads do not cause a ConcurrentModificationException.
        SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new,
                Set::add,
                Set::addAll);
        System.out.println(set); // [f, l, o, w]

        ///////////////////////////////////////////////////////////////////////////////////////////////////////
        // Alternative driver and navigator role.
        //////////////////////////////////////////////////////////////////////////////////////////////////////


        // Not a parallel reduction because it does have the UNORDERED characteristic,
        // but does not have the CONCURRENT characteristic.
        // parallelStream.collect(Collectors.toSet());

        // This is an example from Chapter 10, re-written using a parallel stream and a parallel reduction:
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
        // We use a ConcurrentMap reference, although the actual class returned is likely a ConcurrentHashMap.
        ConcurrentMap<Integer, String> map = ohMy
                .collect(Collectors.toConcurrentMap(String::length,
                        k -> k,
                        (s1,s2) -> s1 + "," + s2));
        System.out.println(map);  // {5=lions, bears, 6=tigers}
        System.out.println(map.getClass()); // java.util.concurrent.ConcurrentHashMap

        // This is a groupingBy() example from Chapter 10, re-written to use a parallel stream and parallel reduction
        var ohMy2 = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, List<String>> map2 = ohMy2.collect(
                Collectors.groupingByConcurrent(String::length));
        System.out.println(map2); // {5=[lions,nears], 6=[tigers]}
    }
}
