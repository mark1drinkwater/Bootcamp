package ch7;

////////////////////////////////////////////////////////////////////////////////////
// Casting Interfaces
//While the compiler can enforce rules about casting to unrelated types for classes, it cannot
//always do the same for interfaces. Remember, instances support multiple inheritance, which
//limits what the compiler can reason about them. While a given class may not implement an
//interface, it’s possible that some subclass may implement the interface. When holding a reference to a particular class, the compiler doesn’t know which specific subtype it is holding.
interface Canine {
}

interface Dog {
}

public class P_Polymorphism2 {
}

///////////////////////////////////////////////////////////////////////////////////
// Disallowed Casts
class Bird {
}

class Fish {
    public static void main(String[] args) {
        Fish fish = new Fish();
//        Bird bird = (Bird)fish; // DOES NOT COMPILE
    }
}

class Wolf2 implements Canine {
}

class BadCasts {
    public static void main(String[] args) {
        Wolf2 wolfy = new Wolf2();
//        Dog badWolf = (Dog) wolfy;  // ClassCastException at runtime.
    }
}

////////////////////////////////////////////////////////////////////////////////////
// The instanceof Operator
class Rodent {}
class Capybara extends Rodent {
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        if (rodent instanceof Capybara c) {
            var capybara = (Capybara) rodent; // ClassCastException
        }
    }
}

// instanceof doesn't allow it to be used with unrelated types
class Fish2 {
    public static void main(String[] args) {
        Fish2 fish = new Fish2();
//        if (fish instanceof Bird b) {} // DOES NOT COMPILE
    }
}