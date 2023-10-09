package OCP.Chapter6.subclasses.constructors;

public class AnimalTest {
    public static void main(String[] args) {
        Gorilla g1 = new Gorilla("Goretty", 10);
        Gorilla g2 = new Gorilla();

        System.out.println(g1);
        System.out.println(g2);
        System.out.println();

        Zebra z1 = new Zebra(12, "Stripes");
        Zebra z2 = new Zebra(5);
        Zebra z3 = new Zebra();

        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
    }
}
