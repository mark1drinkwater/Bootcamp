package OCP.Chapter9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        // Set<Character> letters = Set.of('z', 'o', 'o'); IllegalArgumentException runtime error
        Set<Character> letters = Set.of('z', 'o');
        Set<Character> copy = Set.copyOf(letters);
        System.out.println(letters);
        System.out.println(copy);

        System.out.println();

        Set<Integer> hSet = new HashSet<>();
        System.out.println(hSet.add(66));
        System.out.println(hSet.add(10));
        System.out.println(hSet.add(66));
        System.out.println(hSet.add(8));
        System.out.println("\nPrinting Hash Set");
        System.out.println(hSet + "\n");

        Set<Integer> tSet = new TreeSet<>();
        System.out.println(tSet.add(66));
        System.out.println(tSet.add(10));
        System.out.println(tSet.add(66));
        System.out.println(tSet.add(8));
        System.out.println("\nPrinting Tree Set");
        System.out.println(tSet);
    }
}
