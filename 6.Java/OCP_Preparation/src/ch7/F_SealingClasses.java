package ch7;

public class F_SealingClasses {
    /*
    sealed: Indicates that a class or interface may only be extended/implemented by named
classes or interfaces
permits: Used with the sealed keyword to list the classes and interfaces allowed
■ non-sealed: Applied to a class or interface that extends a sealed class, indicating that it
can be extended by unspecified classes
     */
}

/*
The first example does not compile because the class and sealed modifiers are in the
wrong order. The modifier has to be before the class type. The second example does not
compile because MyWolf isn’t listed in the declaration of Wolf
 */

//class sealed Frog permits GlassFrog {} // DOES NOT COMPILE
//final class GlassFrog extends Frog {}
abstract sealed class Wolf permits Timber  {}
final class Timber extends Wolf {}
//final class DireWolf extends Wolf {} // DOES NOT COMPILE