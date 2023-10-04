package igbook1.lesson4.statics;

public class A04StaticInitializerTest {
    private static final boolean[] switches = new boolean[5];

    // Static initialization blocks:
    /*
        They are executed once when the class is loaded.
        They are used to initialize static variables.
        A class can contain one or more static initializer blocks.
        They can appear anywhere in the class body.
        The blocks are called in the order that they appear in the source code.
     */
    static {
        System.out.println("Initializing...");
        for (int i = 0; i<5; i++) {
            switches[i] = true;
        }
    }


    public static void main(String[] args) {
        switches[1] = false;
        switches[2] = false;
        System.out.println("Switch settings: ");
        for (boolean curSwitch : switches) {
            if (curSwitch) {
                System.out.print("1");
            }
            else {
                System.out.print("0");
            }
        }
    }
}