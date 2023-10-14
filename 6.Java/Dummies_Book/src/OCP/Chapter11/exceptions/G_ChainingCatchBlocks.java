package OCP.Chapter11.exceptions;

public class G_ChainingCatchBlocks {}
// For the exam, you may be given exception classes & need to understand how they function:
// 1st you must recognize if it is a checked or unchecked exception.
// 2nd you must determine whether any of the exceptions are subclasses of others.

class AnimalsOutForAWalk extends RuntimeException {}
class ExhibitClosed extends RuntimeException {}
class ExhibitClosedForLunch extends ExhibitClosed {}
// All 3 are custom exceptions
// All 3 are unchecked exceptions.
// Because they directly or indirectly extend RuntimeException

class TestChaining {
    void seeAnimal() {
        System.out.println("Let's go see the animals");
//        throw new AnimalsOutForAWalk();
        throw new ExhibitClosed();
    }

    public void visitPorcupine() {
        // See if you can identify the 3 possibilities:
        // - No Exception
        // - AnimalsOutForAWalk exception
        // - ExhibitClosed
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {
            System.out.println("Try back later");
        } catch (ExhibitClosed e) {
            System.out.println("Not today");
        }
    }

    public static void main(String[] args) {
        TestChaining t = new TestChaining();
        t.visitPorcupine();
    }

}

class TestChaining2 {
    static void seeAnimal() {
        throw new ExhibitClosed();
    }
    public static void visitMonkeys() {
        try {
            seeAnimal();
            // The more specific (the subclass) exception must always come before
            // The parent (superclass) exception in the order of the catch blocks.

        } catch (ExhibitClosedForLunch e) { // This is the Subclass exception
            System.out.println("Try back later");
        } catch (ExhibitClosed e) { // This is the Superclass exception
            System.out.println("Not today");
        }
    }

    public static void visitMonkeysDontCompile() {
        // This time we reverse the order of the catch blocks.
        // Here the parent (superclass) comes Before the
        // child (subclass).
        // This will not compile.
        // The 2nd catch block is unreachable.


//        try {
//            seeAnimal();
//        } catch (ExhibitClosed e) {
//            System.out.print("not today");
//        } catch (ExhibitClosedForLunch e) { // DOES NOT COMPILE
//            System.out.print("try back later");
//        }
    }

    public void visitSnakes() {
        // DOES NOT COMPILE.
        // Remember that NumberFormatException is a subclass of IllegalArgumentException.

//        try {
//        } catch (IllegalArgumentException e) {
//            // Children (subclasses) must come before the parents (superclasses0
//        } catch (NumberFormatException e) {
//        }
    }


    public void visitManatees() {
        // DOES NOT COMPILE

//        try {
//        } catch (NumberFormatException e1) {
//            System.out.println(e1);
//        } catch (IllegalArgumentException e2) {
//            System.out.println(e1);
//        }
    }

    public static void main(String[] args) {
        visitMonkeys();
    }
}