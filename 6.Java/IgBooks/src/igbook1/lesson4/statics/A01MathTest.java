package igbook1.lesson4.statics;

public class A01MathTest {
    // Math class contains methods, constants for performing basic numeric operations
    public static void main(String[] args) {
        System.out.println("Random: " + Math.random() * 10);
        System.out.println("Square root: " + Math.sqrt(9.0));
        System.out.println("Rounded random: " +
               Math.round(Math.random()* 100) );
        System.out.println("Abs: " + Math.abs(-9));
    }
}
