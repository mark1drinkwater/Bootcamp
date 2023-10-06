package OCP.Chapter9.generics;

import java.util.ArrayList;
import java.util.List;

public class Mammal {
    public List<CharSequence> play() {
        return new ArrayList<>();
    }
    public CharSequence sleep() {
        return "zzz";
    }
}
class Monkey extends Mammal {
    // ArrayList implements the List interface.
    public ArrayList<CharSequence> play() {
        return new ArrayList<>();
    }
}

class Goat extends Mammal {
    // DOES NOT COMPILE
    // Because although a String implements CharSequence
    // The Generic Types MUST be the SAME

//    public List<String> play() {
//        return new ArrayList<>();
//    }

    public String sleep() {
        return "zzz";
    }

}