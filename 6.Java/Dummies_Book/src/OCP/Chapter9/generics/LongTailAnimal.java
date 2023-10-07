package OCP.Chapter9.generics;

import java.util.ArrayList;
import java.util.List;

public class LongTailAnimal {
    protected void chew(List<Object> input) {}
//    protected void chew(List<Double> input) {} // DOES NOT COMPILE
}

class Anteater extends LongTailAnimal {
    protected void chew(List<Object> input) {}
    protected void chew(ArrayList<Double> input) {}
}

interface Shippable<U> {
    void ship (U u);
}

class ShippableRobotCrate<Robot> implements Shippable<Robot> {
    public void ship(Robot t) { }
}

class ShippableAbstractCrate<U> implements Shippable<U> {
    public void ship(U t) { }
}

// No Generic Type is defined, it is a Raw type.
class ShippableCrate implements Shippable {
    public void ship(Object t) { }
}