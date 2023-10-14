package OCP.Chapter11.exceptions;

public class J_HandlingExceptions {
    //////////////// Using try and catch Statements.

    public static void main(String[] args) {
        J_HandlingExceptions girl = new J_HandlingExceptions();

        girl.explore();
    }
    void explore() {
        try {
            fall();
            System.out.println("Never get here ⛔");
        } catch (RuntimeException e) {
            System.out.println("Oops, I fell. 😢");
            getUp();
        }
        seeAnimals();
    }

    private void seeAnimals() {
        System.out.println("Look! It's a Zebra! 🦓");
    }
    private void getUp() {
        System.out.println("Back on my two feet. 🐾");
    }
    void fall() { throw new RuntimeException(); }

    // ====================================================
    // Exam tricks:
    public void trick1() {
        // DOES NOT COMPILE. Why?
        // Missing curly braces
//        try
//            fall();
//        catch (Exception e)
//            System.out.println("get up");

    }

    public void trick2() {
        // DOES NOT COMPILE. Why?
        // Missing a catch or finally block.
//        try {
//            fall();
//        }

    }

}
