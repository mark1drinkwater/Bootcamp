package OCP.Chapter8.B_functions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class F_ConvienceMethods {
    public static void main(String[] args) {
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        // More roundabout way
        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");
        // Shorter way using convience methods.
        brownEggs = egg.and(brown);
        otherEggs = egg.and(brown.negate());

        System.out.println(brownEggs.test("brown eggs"));
        System.out.println(otherEggs.test("scrambled eggs"));


        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 = x -> System.out.print(",2: " + x);

        Consumer<String> combined = c1.andThen(c2);
        combined.accept("cat");

        //////////////////////
        Function<Integer, Integer> result1 = x -> x + 600;
        Function<Integer, Integer> result2 = x -> x / 2;
        Function<Integer, Integer> combined2 = result2.compose(result1);
        System.out.println(combined2.apply(100));

        //////////////////////////
        counts1((var x, var y) -> "Hello"); // DOES NOT COMPILE
        counts2((Integer x, Integer y) -> true); // DOES NOT COMPILE
        counts3((String x, Double y, Integer z) -> true); // DOES NOT COMPILE
        counts4((Integer x, Integer y) -> "goodbye"); // DOES NOT COMPILE


    }

    static void counts1(TestingA a) {
        System.out.println(a.testTestA(2, 2));
    }
    static void counts2(TestingB b) {
        System.out.println(b.testTestB(2, 2));
    }
    static void counts3(TestingC c) {
        System.out.println(c.testTestC("hi", 4.0, 2));
    }
    static void counts4(TestingD d) {
        System.out.println(d.testTestD(5, 5));
    }

    public void variables(int parm) {
//         int b = 1;
//         Predicate<Integer> p1 = a -> {
//             int b = 0;
//             int c = 0;
//             return b == c;
//         };
//        Predicate<Integer> p2 = this::testingMethod;

    }

    boolean testingMethod() {
        int b2 = 0;
        int c = 0;
        return b2 == c;
    }
}

interface TestingA {
    String testTestA(int n1, Integer n2);
}
interface TestingB {
    boolean testTestB(Integer n1, Integer n2);
}
interface TestingC {
    boolean testTestC(String s1, Double d1, Integer i1);
}
interface TestingD {
    String testTestD(Integer n1, Integer n2);
}








