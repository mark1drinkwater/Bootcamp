package ch14.T_to_V_SerialisingDeserialising;

import java.io.Serializable;

public class T_SerialiseTest {
}

class Gorilla implements Serializable {
    private static final long serialVersionUID = 1L; // Very good practice
    private String name;
    private int age;
    private Boolean friendly;
    private transient String favoriteFood; // transient means it is not serialised.
    // Constructors/Getters/Setters/toString() omitted
    public Gorilla(String name, int age, Boolean friendly) {
        this.name = name;
        this.age = age;
        this.friendly = friendly;
    }

    @Override
    public String toString() {
        return "Gorilla{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendly=" + friendly +
                '}';
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
// Serialisation Rules:
/*
How to Make a Class Serializable
■ The class must be marked Serializable.
■ Every instance member of the class must be serializable, marked transient, or have a
null value at the time of serialization.
Be careful with the second rule. For a class to be serializable, we must apply the second
rule recursively. Do you see why the following Cat class is not serializable?
 */

class Cat implements Serializable {
    private Tail tail = new Tail();
}
class Tail implements Serializable {
    private Fur fur = new Fur();
}
class Fur {}


/*
FIXES:
public class Tail implements Serializable {
    private transient Fur fur = new Fur();
}
public class Fur implements Serializable {}
 */