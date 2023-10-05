package OCP.Chapter9.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Duck implements Comparable<Duck> {

    private String name;

    public Duck(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Duck d) {
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();

        System.out.println(ducks);

        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        System.out.println("Before sorting");
        System.out.println(ducks);
        Collections.sort(ducks);
        System.out.println("After sorting");
        System.out.println(ducks);
    }

}
