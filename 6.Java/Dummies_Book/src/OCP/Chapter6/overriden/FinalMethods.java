package OCP.Chapter6.overriden;

public class FinalMethods {}

class Bird {
    public final boolean hasFeathers() {
        return true;
    }
    public final static void flyAway() {}
}
class Penguin extends Bird {
//    public final boolean hasFeathers() { // DOES NOT COMPILE
//        return false;
//    }
//    public final static void flyAway() {} // DOES NOT COMPILE
}
