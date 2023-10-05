package OCP.Chapter9.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Duck2 implements Comparable<Duck2> {

    private String name;
    public int weight;

    public Duck2(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " " + weight + " kg";
    }

    @Override
    public int compareTo(Duck2 d) {
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        Comparator<Duck2> byWeight = (d1, d2) -> d1.weight - d2.weight;

        Comparator<Duck2> byNameThenWeight = Comparator.comparing(Duck2::getName).thenComparingInt(Duck2::getWeight).reversed();

        var ducks = new ArrayList<Duck2>();


        ducks.add(new Duck2("Quack", 7));
        ducks.add(new Duck2("Quack", 3));
        ducks.add(new Duck2("Puddles", 10));
        ducks.add(new Duck2("Puddles", 13));
        ducks.add(new Duck2("Quack", 5));

        System.out.println("Before sorting");
        System.out.println(ducks);
        Collections.sort(ducks);

        System.out.println("After sorting by Name");
        System.out.println(ducks);

        Collections.sort(ducks, byWeight);
        System.out.println("After sorting -by Weight");
        System.out.println(ducks);

        Collections.sort(ducks, byNameThenWeight);
        System.out.println("After sorting by Name and Weight");
        System.out.println(ducks);
    }

}
