package OCP.Chapter6.subclasses.constructors;

public class Gorilla extends Animal {
    public Gorilla(String name, int age) {
        super(age, name);
    }

    public Gorilla(int age) {
        this("Gorilla", age); // Calls the first Animal constructor
    }
    public Gorilla() {
        this(5);
    }

    @Override
    public String toString() {
        return "Gorilla " + super.toString();
    }

}