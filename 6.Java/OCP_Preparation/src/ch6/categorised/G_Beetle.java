package ch6.categorised;

class Insect {
    protected int numberOfLegs = 4;
    private String species = "Fly";
    String label = "buggy";
}

class Beetle extends Insect {
    protected int numberOfLegs = 6;
    short age = 3;

    public void printData() {
        System.out.println(this.label);
        System.out.println(super.label);
        System.out.println(this.age);
//        System.out.println(super.age); //Does not compile
        System.out.println(numberOfLegs);
        System.out.println(super.numberOfLegs);
//        System.out.println(super.species); //Does not compile
            /*
            Since both super and this have access to the inherited members.
            It's better to just use this.
            Only use super when you have a naming conflict.
             */
    }

    public static void main(String[] n) {
        new Beetle().printData();
    }
}