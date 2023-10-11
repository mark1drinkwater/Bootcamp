package ch1;

public class L_ReadingWritingMembers {
}

class Swan {
    int numberEggs; // instance variable

    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1; // set variable
        System.out.println(mother.numberEggs); // read variable
    }
}

// =======================================
// Executing Instance Initializer Blocks
// =======================================
class Chick2 {
    private String name = "Fluffy";

    {
        System.out.println("setting field");
    }

    public Chick2() {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Chick2 chick = new Chick2();
        System.out.println(chick.name);
    }
}



class Egg {
    public Egg() {
        number = 5;
    }
    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }
    private int number = 3;
    { number = 4; }
}