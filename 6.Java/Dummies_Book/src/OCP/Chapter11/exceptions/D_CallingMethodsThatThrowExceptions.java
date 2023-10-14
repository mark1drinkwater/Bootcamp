package OCP.Chapter11.exceptions;

import static OCP.Chapter11.exceptions.Bunny.eatCarrot;

public class D_CallingMethodsThatThrowExceptions {
}

// Remember, the Exception class is a Checked exception.
class NoMoreCarrotsException extends Exception {}

class Bunny {
    public static void main(String[] args) {
        // DOES NOT COMPILE
//        eatCarrot(3);
    }
    public static void eatCarrot(int carrotsLeftover) throws NoMoreCarrotsException {
        if (carrotsLeftover == 0 ) {
            throw new NoMoreCarrotsException();
        }

        System.out.print("I'm a 🐇 that ate this many ");
        for (int i = 0; i < carrotsLeftover; i++) {
            System.out.print("🥕");
        }
        System.out.println();
        System.out.println();
    }
}


// --------------------------------------------------------
// Same example but does it compile now?
// Why or why not?
class BunnyPleaseCompile1 {
    public static void main(String[] args) throws NoMoreCarrotsException {
        eatCarrot(0);
    }
}

// How about this one?
class BunnyPleaseCompile2 {
    public static void main(String[] args) {
        try {
            eatCarrot(0);
            System.out.println("Happy rabbits 🐇 eat lots of carrots 🥕");
        } catch (NoMoreCarrotsException e) {
            System.out.println("Sad rabbit 😥");
        }
    }
}

// ===========================================================
class NoThrowsCannotCatch {
    // What's different with this one?
    private void eatCarrot() {}

    public void bad() {
//        try {
//            eatCarrot();
//        } catch (NoMoreCarrotsException e) { // DOES NOT COMPILE. How come?
//            System.out.println("Sad rabbit 😥");
//        }
    }
}