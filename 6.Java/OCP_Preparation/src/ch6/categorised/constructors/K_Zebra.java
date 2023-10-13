package ch6.categorised.constructors;

public class K_Zebra extends Animal {

    public K_Zebra(int age, String name) {
        super(age, name);
    }

    public K_Zebra(int age) {
        this(age, "Zebra");
    }

    public K_Zebra() {
        this(4, "Zebra");
    }

    @Override
    public String toString() {
        return "Zebra " + super.toString();
    }

    public static void main(String[] args) {
        K_Zebra z1 = new K_Zebra(5, "Stripes");
        K_Zebra z2 = new K_Zebra(3);
        K_Zebra z3 = new K_Zebra();

        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
    }
}
