package ch1;

public class D_Zoo {

    // Each file can only contain one public class
    // The filename must match the class name, (case-sensitive) and

    // public means it can be accessed from anywhere
    // static means we don't need an object to use it
    // void means it doesn't return anything
    // String[] args   or   String options[]   or String... friends

    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}

class Zoo2 {
    // An acceptable variation
    public final static void main(final String[] args) {}
}

class Zoo3 {
    // Another acceptable variation
    public static void main(String[] args) {}
}