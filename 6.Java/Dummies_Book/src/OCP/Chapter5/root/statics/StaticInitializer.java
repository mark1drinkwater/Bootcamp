package OCP.Chapter5.root.statics;

public class StaticInitializer {
    private static int one;
    private static final int two;
    // So statics are given a default value but not if it's final.
    private static final int three;
    // private static final int four; // won't compile because it's not initialized in the static initializer

    // Avoid using initializers & static initializers
    // It makes your code much harder to read. Instead, do everything inside a constructor.

    static {
        one = 1;
        two = 2;
        three = 3;
        // two = 4; can't change the value once assigned
    }

    /*
        There is a case to use a static initializer: when you need to initialize a static
        field and the code to do so requires more than one line. This often occurs when you want to
        initialize a collection like an ArrayList or a HashMap. When you do need to use a static
        initializer, put all the static initialization in the same block.
     */

}
