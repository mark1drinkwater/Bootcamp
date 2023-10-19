package ch7;

public class B_MoreAboutInterfaces {
}
// Mixing Class and Interface Keywords
interface CanRun {}
//public class Cheetah extends CanRun {} // DOES NOT COMPILE
class Hyena {}
//public interface HasFur extends Hyena {} // DOES NOT COMPILE

///////////////// Inheriting Duplicating Abstract Methods
// Java supports inheriting two abstract methods that have compatible method declarations.

interface Herbivore { public void eatPlants(); }
interface Omnivore { public void eatPlants(); }
class Bear implements Herbivore, Omnivore {
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}

// Incompatible Declaration:
interface Herbivore2 { public void eatPlants(); }
interface Omnivore2 { public int eatPlants(); }
//class Tiger implements Herbivore2, Omnivore2 {
//    @Override
//    public void eatPlants() {
//    } // DOES NOT COMPILE
//}

////////////////////////////////////////////////////
// Inserting Implicit Modifiers
/*
Interfaces are implicitly abstract.
■ Interface variables are implicitly public, static, and final.
■ Interface methods without a body are implicitly abstract.
■ Interface methods without the private modifier are implicitly public.
 */

// These 2 interface definitions are equivalent
interface Soar1 {
    int MAX_HEIGHT = 10;
    public final static boolean UNDERWATER = true;
    void fly(int speed);
    abstract void takeoff();
    public abstract double dive();
}

abstract interface Soar {
    public static final int MAX_HEIGHT = 10;
    public final static boolean UNDERWATER = true;
    public abstract void fly(int speed);
    public abstract void takeoff();
    public abstract double dive();
}

// Conflicting Modifiers
interface Dance {
//    private int count = 4; // DOES NOT COMPILE
//    protected void step(); // DOES NOT COMPILE
}









