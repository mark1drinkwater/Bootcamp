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
}
