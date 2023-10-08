package OCP.Chapter6.subclasses.constructors;

public class Mammal {
    public Mammal(int age) {}
    /*
        If you already have a constructor and want a no-arg constructor.
        You must explicitly define it:
        public Mammal() {}
     */
}

// class Seal extends Mammal{} Does not compile cz it inherits the default constructor
// but the mammal class only has 1 constructor with 1 parameter.

/*
Won't compile the same reason as above ^^.
    class Elephant extends Mammal {
        public Elephant() {}
    }

Also doesn't compile for similar reasons:
public class Seal extends Mammal {
    public Seal() {
        super(); // DOES NOT COMPILE. No matching constructor in the parent (mammal) class.
    }
}
 */

// Fix: 1) Add a matching call to the parent constructor. or 2) Add a constructor in the parent class.
class Elephant extends Mammal {
    public Elephant(int age) {
        super(age);
    }
    public Elephant() {
        this(1); // Explicit call to parent constructor
    }
}

