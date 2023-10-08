package OCP.Chapter6.subclasses.constructors;

public class Zebra extends Animal {

    public Zebra(int age, String name) {
        super(age, name);
    }

    public Zebra(int age) {
        this(age, "Zebra");
    }

    public Zebra() {
        this(4, "Zebra");
    }

    @Override
    public String toString() {
        return "Zebra " + super.toString();
    }
}
