package OCP.Chapter9.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingDuck implements Comparable<MissingDuck> {
    private String name;
    public int compareTo(MissingDuck quack) {
        if (quack == null)
            throw new IllegalArgumentException("Poorly formed duck");
        if (this.name == null && quack.name == null) {
            System.out.println("Both Ducks are Nameless");
            return 0;
        } else if (this.name == null) {
            System.out.println("This duck is null.");
            return -1;
        } else if (quack.name == null) {
            System.out.println("Quack's name is null.");
            return -1;
        } else {
            return name.compareTo(quack.name);
        }
    }

    public MissingDuck(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        List<MissingDuck> md = new ArrayList<>();
        MissingDuck d1 = new MissingDuck("Smiley");
        MissingDuck d2 = new MissingDuck("Grouchy");
        System.out.println(d1.compareTo(d2));

        md.add(d1);
        md.add(d2);

        System.out.println(md);
        Collections.sort(md);
        System.out.println(md);
    }
}
