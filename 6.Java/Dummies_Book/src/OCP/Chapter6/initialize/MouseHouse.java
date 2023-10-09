package OCP.Chapter6.initialize;

public class MouseHouse {
    private final int volume;
    private final String type;
    private final String name = "The Mouse House"; // Declaration assignment

    {
        volume = 10; // Instance initializer assignment
    }
    public MouseHouse(String type) {
        this.type = type;
    }
    public MouseHouse() {
//        Already initialised it in the initialization block.
//        this.volume = 2; // DOES NOT COMPILE

        // Three different fixes:
        // Fix 1: Initialise it in the constructor.
        type = "Mansion";
        // 2nd fix would be it initialise it in the same line that it is declared.
        // 3rd fix would be to initialise it in the initialization block.
    }
}