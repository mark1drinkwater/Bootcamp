package OCP.Chapter9.sort;

import java.util.Set;
import java.util.TreeSet;


public class UseTreeSet {

    static record Rabbit(int id) implements Comparable {
        @Override
        public int compareTo(Object o) {
            return this.id - ((Rabbit) o).id;
        }
    }

    public static void main(String[] args) {
//        Set<Duck> ducks = new TreeSet<>();  ClassCastException at Runtime, but NOT a compile error!
//        ducks.add(new Duck("Puddles"));

//        Set<Rabbit> rabbits = new TreeSet<>();
        Set<Rabbit> rabbits = new TreeSet<>((r1, r2) -> r1.id - r2.id); // Another way to sort, if you don;t want to implement comparable.
        rabbits.add(new Rabbit(3));
        rabbits.add(new Rabbit(1));
        rabbits.add(new Rabbit(9));

        System.out.println(rabbits);
    }
}