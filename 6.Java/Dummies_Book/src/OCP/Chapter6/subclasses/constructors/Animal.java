package OCP.Chapter6.subclasses.constructors;

public class Animal {
    private int age;
    private String name;
    public Animal(int age, String name) {
        this(age);
        this.name = name;
    }
    public Animal(int age) {
        super();
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal name:%s and age:%d".formatted(name, age);
    }
}