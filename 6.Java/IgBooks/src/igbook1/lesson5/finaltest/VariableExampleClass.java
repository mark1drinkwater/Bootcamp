package igbook1.lesson5.finaltest;

public class VariableExampleClass {
    private final int field;
    public static final int JAVA_CONSTANT = 10;

    // Final fields (instance variables) must be either of the following:
    /*
        x Assigned a value when declared.
        x Assigned a value in every constructor.
     */

    // A field that is both static AND final is considered a constant.

    public VariableExampleClass() {
        field = 100;
    }

    public void changeValues(final int param) {
//        param = 1; // compile-time error
        final int localVar;
        localVar = 42;
//        localVar = 43 // compile-time error
    }

}
