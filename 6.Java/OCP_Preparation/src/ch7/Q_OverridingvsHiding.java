package ch7;

public class Q_OverridingvsHiding {
}

/*
While method overriding replaces the method everywhere it is called, static method and
variable hiding do not. Strictly speaking, hiding members is not a form of polymorphism
since the methods and variables maintain their individual properties. Unlike method overriding, hiding members is very sensitive to the reference type and location where the member is
being used
 */
class Penguin {
    public static int getHeight() {
        return 3;
    }

    public static void main(String[] args) {
        System.out.println(new CrestedPenguin().getHeight());
    }

    public void printInfo() {
        System.out.println(getHeight());
    }
}

class CrestedPenguin extends Penguin {
    public static int getHeight() {
        return 8;
    }

    public static void main(String... fish) {
        // This does not call the getHeight() method in CrestedPenguin
        new CrestedPenguin().printInfo();
    }
}

////////////////////////////////////////////////////////////////////
// The location of the static method call
// and the reference type can also determine the value you get when working with hidden members.
class Marsupial {
    protected int age = 2;

    public static boolean isBiped() {
        return false;
    }
}
class Kangaroo extends Marsupial {
    protected int age = 6;

    public static boolean isBiped() {
        return true;
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        Marsupial moey = joey;

        System.out.println(joey.isBiped()); // Java just uses the reference type: Kangaroo.isBiped()
        System.out.println(moey.isBiped()); // Java just uses the reference type: Marsupial.isBiped()

        System.out.println(joey.age);
        System.out.println(moey.age);

        joey = null;
        moey = null;

        System.out.println(joey.isBiped()); // Java just uses the reference type: Kangaroo.isBiped()
        System.out.println(moey.isBiped()); // Java just uses the reference type: Marsupial.isBiped()
    }
}