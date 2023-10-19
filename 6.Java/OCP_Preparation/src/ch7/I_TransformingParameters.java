package ch7;

public class I_TransformingParameters {
}

record Crane7(int numberEggs, String name) {
    public Crane7 {
        if (name == null || name.length() < 1)
            throw new IllegalArgumentException();
        name = name.substring(0, 1).toUpperCase()
                + name.substring(1).toLowerCase();
    }
}

///////////////////////////////////////////////////////////////////////
// Overloaded constructors
/*
You can also create overloaded constructors that take a completely different list of parameters.
They are more closely related to the long-form constructor and don’t use any of the syntactical features of
compact constructors.
 */
record Crane8(int numberEggs, String name) {
    // The first line of an overloaded constructor MUST BE an explicit call to another constructor via this().
    // If there are no other constructors, the long constructor must be called.
    // This is NOT OPTIONAL compared to what we learnt about constructors in classes.
    // Also, unlike compact constructors, you can only transform the data on the first line. After the first line, all of the fields will already be assigned,
    // and the object is immutable.
    public Crane8(String firstName, String lastName) {
        this(0, firstName + " " + lastName);
    }
}

record Crane9(int numberEggs, String name) {
    public Crane9(int numberEggs, String firstName, String lastName) {
        this(numberEggs + 1, firstName + " " + lastName);
        numberEggs = 10; // NO EFFECT (applies to parameter, not instance field)
//        this.numberEggs = 20; // DOES NOT COMPILE
    }
}

/*
    As you saw in Chapter 6, you also can’t declare two record constructors that call each
    other infinitely or as a cycle.
    public record Crane(int numberEggs, String name) {
        public Crane(String name) {
            this(1); // DOES NOT COMPILE
    }
        public Crane(int numberEggs) {
            this(""); // DOES NOT COMPILE
        }
    }
 */