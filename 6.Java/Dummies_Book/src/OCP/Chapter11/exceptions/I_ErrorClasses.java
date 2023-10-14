package OCP.Chapter11.exceptions;

// Errors are unchecked exceptions that extend the Error class.
// The program is often unable to recover from them.
public class I_ErrorClasses {
    public static void main(String[] args) {
        // StackOverflowError
        // Thrown when a method calls itself too many times
        // (infinite recursion)
        infinity();
    }

    static void infinity() {
        infinity();
    }
}