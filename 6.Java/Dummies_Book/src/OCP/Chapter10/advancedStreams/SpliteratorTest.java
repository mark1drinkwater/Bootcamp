package OCP.Chapter10.advancedStreams;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorTest {
    public static void main(String[] args) {
        var stream = List.of("bird-", "bunny-", "cat-", "dog-", "fish-", "lamb-", "mouse-");
        Spliterator<String> originalBagOfFood = stream.spliterator();

        Spliterator<String> emmasBag = originalBagOfFood.trySplit();
        System.out.println("Emma's Bag:");
        emmasBag.forEachRemaining(System.out::print);

        System.out.println("\n\nJill's Bag:");
        Spliterator<String> jillsBag = originalBagOfFood.trySplit();
        System.out.println("Try Advance:");
        jillsBag.tryAdvance(System.out::print);
        System.out.println("\nFor each remaining:");
        jillsBag.forEachRemaining(System.out::print);

        System.out.println("\n\nOriginal Bag:");
        originalBagOfFood.forEachRemaining(System.out::print);

        // ======= Spliterator with infinite Streams =====
        System.out.println("\n\nSplitting");

        var originalBag = Stream.iterate(1, n -> ++n)
                .spliterator();
        Spliterator<Integer> newBag = originalBag.trySplit();
        newBag.tryAdvance(System.out::print); // 1
        newBag.tryAdvance(System.out::print); // 2
        newBag.tryAdvance(System.out::print); // 3

        newBag.forEachRemaining(System.out::println);
    }
}
