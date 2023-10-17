package OCP.Chapter8.A_lambda;

@FunctionalInterface
interface Converter {
    long round(double num);
}

public class C_CallingStaticMethods {
    public static void main(String[] args) {
        // Notice we're calling a static method.
        Converter methodRef = Math::round;
        Converter lambda = x -> Math.round(x);

        System.out.println("Method reference, rounding off to " + methodRef.round(100.1)); // 100
        System.out.println("Lambda rounding off to " + lambda.round(99.9)); // 100
    }
}

