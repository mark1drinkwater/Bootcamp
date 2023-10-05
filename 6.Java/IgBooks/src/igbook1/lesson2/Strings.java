package igbook1.lesson2;

public class Strings {
    public static void main(String[] args) {
        char letter = 'a';

        String string1 = "Hello";
        String string2 = "World";
        String string3 = "";
        String dontDoThis = new String("Hello");

        string3 = string1 + string2; // Concatenate Strings

        System.out.println("Output: " + string3 + " " + letter);

        // The string class is immutable.
        // The immutability of String objects helps the JVM to re-use String objects to reduce memory overhead & improve performance.
        // The new keyword creates another instance functionally identical to a literal
        // If used a lot, a lot of needless String instances are created.

    }
}
