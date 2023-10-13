package OCP.Chapter6.abstracts;

public abstract class Animal2 {
    abstract String getName();
}

abstract class BigCat extends Animal2 {
    protected abstract void roar();
}

class Cheetah extends BigCat {
    @Override
    public String getName() {
        return "Cheetah";
    }
    @Override
    public void roar() {
        System.out.println("I don't roar I run instead!");
    }
}

class Lion extends BigCat {
    @Override
    public String getName() {
        return "Lion";
    }
    @Override
    public void roar() {
        System.out.println("The lion ROARS with flavour!");
    }

    public static void main(String[] args) {
        Lion simba = new Lion();
        simba.roar();

        Cheetah cheetah = new Cheetah();
        cheetah.roar();
    }
}