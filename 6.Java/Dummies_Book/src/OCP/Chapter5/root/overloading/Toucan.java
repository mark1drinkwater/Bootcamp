package OCP.Chapter5.root.overloading;

public class Toucan {
    // This will only accept arrays.
//    public void fly(int[] lengths) {}

    // This accepts arrays and spread out arguments.
    public void fly(int... lengths) {} // DOES NOT COMPILE
    // Trick question! Remember that Java treats varargs as if they were an array.
    // This means the method signature is the same for both methods.
}
