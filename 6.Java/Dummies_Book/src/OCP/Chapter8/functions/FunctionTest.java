package OCP.Chapter8.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String,Integer> mr = String::length;
        Function<String,Integer> lamda = s -> s.length();
        System.out.println(mr.apply("cluck"));

        BiFunction<String, String, String> mr2 = String::concat;
        BiFunction<String, String, String> lambda2 = (s1, s2) -> s1.concat(s2);
        System.out.println(mr2.apply("Mark", "Drinkwater"));
    }
}