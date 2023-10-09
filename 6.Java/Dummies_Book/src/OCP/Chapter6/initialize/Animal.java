package OCP.Chapter6.initialize;

public class Animal {
    static { System.out.print("A"); }
}

class Hippo extends Animal {
    public static void main(String[] grass) {
        System.out.print("C");
        new Hippo();
        new Hippo();
        new Hippo();
    }
    static { System.out.print("B"); }
    /*
    First the parent class is initialized then the child class.
     */
}