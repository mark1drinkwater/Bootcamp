package ch6.categorised.constructors;

public class M_ParentConstructors {
}

class Animal {
    private int age;
    private String name;
    public Animal(int age) {
        super(); // Refers to constructor in java.lang.Object
        this.age = age;
        this.name = null;
    }

    public Animal(int age, String name) {
        this.name = name;
    }
}

class Zebra extends Animal {
    public Zebra(int age) {
        super(age); // Refers to constructor in Animal
    }
    public Zebra() {
        this(4); // Refers to constructor in Zebra with int argument
    }
}

class Zoo {
    public Zoo() {
        System.out.println("Zoo created");
//        super(); // DOES NOT COMPILE
    }
}
class Zoo2 {
    public Zoo2() {
        super();
        System.out.println("Zoo created");
//        super(); // DOES NOT COMPILE
    }
}

class Gorilla extends Animal {
    public Gorilla(int age) {
        super(age,"Gorilla"); // Calls the first Animal constructor
    }
    public Gorilla() {
        super(5); // Calls the second Animal constructor
    }
}