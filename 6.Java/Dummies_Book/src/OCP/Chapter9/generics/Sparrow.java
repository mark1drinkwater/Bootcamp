package OCP.Chapter9.generics;

import java.util.ArrayList;
import java.util.List;

public class Sparrow extends Bird {
}

class Bird {
    public static void main(String[] args) {
        List<? extends Bird> birds = new ArrayList<Bird>();
        // Must be a Sparrow OR a BIRD.

//                birds.add(new Sparrow()); // DOES NOT COMPILE
//                birds.add(new Bird()); // DOES NOT COMPILE
    }
}


interface Flyer { void fly(); }
class HangGlider implements Flyer {
    public void fly() {}
}
class Goose implements Flyer {
    public void fly() {}
}
class GenericInterfaceTest {
    private void anyFlyer (List < Flyer > flyer) {}
    private void groupOfFlyers (List < ? extends Flyer > flyer){}

    public static void main(String[] args) {
        List<Flyer> flyers = new ArrayList<>();
        List<HangGlider> hangGliders = new ArrayList<>();
        List<Goose> geese = new ArrayList<>();

        GenericInterfaceTest git = new GenericInterfaceTest();
        git.anyFlyer(flyers);
//        git.anyFlyer(hangGliders);
//        git.anyFlyer(geese);

        git.groupOfFlyers(flyers);
        git.groupOfFlyers(hangGliders);
        git.groupOfFlyers(geese);

    }
}