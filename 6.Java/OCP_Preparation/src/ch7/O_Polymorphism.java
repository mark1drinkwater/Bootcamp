package ch7;

public class O_Polymorphism {
}

class Primate {
    public boolean hasHair() {
        return true;
    }
}
interface HasTail2 {
    public abstract boolean isTailStriped();
}
class Lemur extends Primate implements HasTail2 {
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        // One only object (lemur is created)
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        //
        HasTail2 hasTail = lemur;
        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur; // Implicit Cast to supertype
        System.out.println(primate.hasHair());

        HasTail2 hasTail3 = new Lemur();
//        System.out.println(hasTail.age); // DOES NOT COMPILE

        Primate primate4 = new Lemur();
//        System.out.println(primate.isTailStriped()); // DOES NOT COMPILE

        Lemur lemur2 = (Lemur)primate; // Explicit Cast to subtype
//        Lemur lemur3 = primate; // DOES NOT COMPILE (missing cast)
    } }