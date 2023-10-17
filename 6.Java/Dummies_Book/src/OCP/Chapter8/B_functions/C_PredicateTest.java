package OCP.Chapter8.B_functions;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class C_PredicateTest {
    public static void main(String[] args) {
        Predicate<String> mr = String::isEmpty;
        Predicate<String> l = s -> s.isEmpty();
        System.out.println(mr.test(""));

        BiPredicate<String, String> mr2 = String::startsWith;
        BiPredicate<String, String> l2 = (s1, s2) -> s1.startsWith(s2);
        System.out.println(mr2.test("Mark", "M"));
    }
}
