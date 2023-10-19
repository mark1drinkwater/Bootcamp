package ch7;

interface Poodle { // abstract optional in interface declaration
    void play(); // abstract optional in method declaration
}

//////////////////////////////////////////////////////////////////////////
// Writing a default Interface Method
interface IsColdBlooded {
    boolean hasScales();

    default double getTemperature() {
        return 10.0;
    }
}

public class C_DelvingDeeperInterfaces {
}

/////////////////////////////////////////////////////////
// Differences between Interfaces and Abstract Classes
abstract class Husky { // abstract required in class declaration
    abstract void play(); // abstract required in method declaration
}
//public class Georgette implements Poodle {
//    void play() {} // DOES NOT COMPILE - play() is public in Poodle
//}

//
class Webby extends Husky {
    void play() {
    } // OK - play() is declared with package access in Husky
}

class Snake implements IsColdBlooded {
    public boolean hasScales() { // Required override
        return true;
    }

    public double getTemperature() { // Optional override
        return 12;
    }
}

//////
interface Carnivore {
//    public default void eatMeat(); // DOES NOT COMPILE
//    public int getRequiredFoodAmount() { // DOES NOT COMPILE
//        return 13;
//    }
}

////////////////////////////////////////////////////////////////////////////////
// Inheriting Duplicate default Methods
////////////////////////////////////////////////////////////////////////////////
interface Walk {
    public default int getSpeed() { return 5; }
}
interface Run {
    public default int getSpeed() { return 10; }
}

//class Cat1 implements Walk, Run { // DOES NOT COMPILE
//}

// Clearing up the ambiguity of which default method to use, by overwriting
class Cat2 implements Walk, Run {
    @Override
    public int getSpeed() {
        return 0;
    }
}

///////////////////////////////////////////////////////////////////////
// Calling a Hidden default Method
class Cat implements Walk, Run {
    public int getSpeed() {
        return 1;
    }
    public int getWalkSpeed() {
        return Walk.super.getSpeed();
    } }

/////////////////////////////////////////////////////////////////////////////
// Calling Abstract Methods
interface ZooRenovation {
    public String projectName(); // remember it implicitly looks like public abstract String projectName();
    abstract String status(); // remember it implicitly looks like public abstract String status();
    default void printStatus() {
        // Default & private non-static methods can access abstract methods in the interface.
        // This is the primary reason we associate these methods with instance membership.
        System.out.print("The " + projectName() + " project " + status());
    }
}
// Rules:
//Treat abstract, default, and non-static private methods as belonging to an instance of the interface.
//Treat static methods and variables as belonging to the interface class object.
//All private interface method types are only accessible within the interface declaration.

// Tricky business:
interface ZooTrainTour {
    abstract int getTrainName();
    private static void ride() {}
    default void playHorn() { getTrainName(); ride(); }
//    public static void slowDown() { playHorn(); } // Does Not Compile
    static void speedUp() { ride(); }
}