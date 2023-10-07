package OCP.Chapter8.functions;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryTest {
    public static void main(String[] args) {
        UnaryOperator<String> mr = String::toUpperCase;
        UnaryOperator<String> lambda = s -> s.toUpperCase();
        System.out.println("Unary operator " + mr.apply("Mark"));

        BinaryOperator<String> mr2 = String::concat;
        BinaryOperator<String> lambda2 = (s1, s2) -> s1.concat(s2);
        System.out.println("Binary operator " +  mr2.apply("Mark", "Drinkwater"));

        UnaryOperator<Double> mr3 = Math::floor;
        UnaryOperator<Double> lambda3 = i -> Math.floor(i);
        System.out.println("Math floor " + lambda3.apply(5.999));

        BinaryOperator<Double> mr4 = Math::pow;
        BinaryOperator<Double> lambda4 = (b, x) -> Math.pow(b, x);
        System.out.println("Math pow " + lambda4.apply(4.0, 3.0));
        // Although Math.pow also accepts an int. The Binary Operator will only allow of type Double,
        System.out.println(Math.pow(4, 3));

        // Integer object
        // System.out.println("Math pow Integer test " + lambda4.apply(Integer.valueOf(4), Integer.valueOf(3))  );

        Function<List<String>, String> ex1 = x -> x.get(0); // DOES NOT COMPILE
        UnaryOperator<Long> ex2 = (Long l) -> (long)(3.14); // DOES NOT COMPILE

    }
}
