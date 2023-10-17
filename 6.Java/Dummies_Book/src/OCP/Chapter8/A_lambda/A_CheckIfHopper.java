package OCP.Chapter8.A_lambda;

import java.util.ArrayList;
import java.util.List;

record Animal(String species, boolean canHop, boolean canSwim) {}
@FunctionalInterface
interface CheckTrait {
    boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
    @Override
    public boolean test(Animal a) {
        return a.canHop();
    }
}

class TraditionalSearch {
    public static void main(String[] args) {
        // list of animals
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // pass class that does check
        print(animals, new CheckIfHopper());

        // Lambdas to the rescue!!!
        System.out.println("The lambda way");
        print(animals, a -> a.canHop());
    }

    private static void print(List<Animal> amimals, CheckTrait checker) {
        for (Animal animal : amimals) {
            // General check
            if (checker.test(animal))
                System.out.println(animal + " ");
        }
        System.out.println();
    }

}


@FunctionalInterface
interface Sprint {
    public void sprint(int speed);
}
@FunctionalInterface
interface Dash extends Sprint {}
//Not a @FunctionalInterface
interface Skip extends Sprint {
    void skip();
}
//@FunctionalInterface
interface Sleep {
    private void snore() {}
    default int getZzz() { return 1; }
}
@FunctionalInterface
interface Climb {
    void reach();
    default void fall() {}
    static int getBackUp() { return 100; }
    private static boolean checkHeight() { return true; }
}
// Not a @FunctionalInterface because all classes inherit the Object class.
interface Soar {
    abstract String toString();
}

@FunctionalInterface
interface Dive {
    String toString();
    public boolean equals(Object o);
    public abstract int hashCode();
    public void dive();
}

// Not A @FunctionalInterface
interface Dive2 {
    String toString();
    // because equals method signature differs from the Object class
    public boolean equals(String o);
    public abstract int hashCode();
    public void dive();
}