package OCP.Chapter6.abstracts;

abstract class Mammal {
    abstract void showHorn();
    abstract void eatLeaf();
}

abstract class Rhino extends Mammal {
    void showHorn() {
        System.out.println("Pointy horn.");
    } // Inherited from mammal

    abstract void lookTough();
}

public class BlackRhino extends Rhino {
    @Override
    void eatLeaf() {
        System.out.println("Eating");
    }

    @Override
    void lookTough() {
        System.out.println("I'm so scary.");
    }
}
