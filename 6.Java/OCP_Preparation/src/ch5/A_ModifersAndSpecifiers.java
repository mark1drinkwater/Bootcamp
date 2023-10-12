package ch5;

public class A_ModifersAndSpecifiers {
    public void skip1() {}
//    default void skip2() {} // DOES NOT COMPILE
//    void public skip3() {} // DOES NOT COMPILE
    void skip4() {}

    /*
    static Indicates the method is a member of the shared class objects
    abstract Used in an abstract class or interface when the method body is excluded
    final Specifies that the method may not be overridden in a subclass
    default Used in an interface to provide a default implementation of a method for classes that implement the interface
    synchronized Used with multithreaded code

    While access modifiers and optional specifiers can appear in any order, they must all
appear before the return type.
     */
}

class Exercise {
    public void bike1() {}
    public final void bike2() {}
    public static final void bike3() {}
    public final static void bike4() {}
//    public modifier void bike5() {} // DOES NOT COMPILE
//    public void final bike6() {} // DOES NOT COMPILE
    final public void bike7() {}
}