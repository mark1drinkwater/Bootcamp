package ch7;

public class A_InterfaceBasics {
}

abstract interface WalksOnTwoLegs {}
class Biped {
    public static void main(String[] args) {
//        var e = new WalksOnTwoLegs(); // Does Not Compile
    }
}

//public final interface WalksOnEightLegs{} // DOES NOT COMPILE

interface Climb {
    Number getSpeed(int age);
}

////////////////////////////////////////////////////////
// Extending an Interface
interface Nocturnal {
    public int hunt();
}
interface CanFly {
    public void flap();
}
interface HasBigEyes extends Nocturnal, CanFly {}
class Owl implements HasBigEyes {
    public int hunt() { return 5; }
    public void flap() { System.out.println("Flap!"); }
}
////////////////////////////////////////////////////////////
interface HasTail {
    public int getTailLength();
}
interface HasWhiskers {
    public int getNumberOfWhiskers();
}
abstract class HarborSeal implements HasTail, HasWhiskers {}
//class CommonSeal extends HarborSeal {} // DOES NOT COMPILE