package OCP.Chapter9.sort;

import java.util.*;

public class SortRabbits {
static record Rabbit(int id) implements Comparable {
    @Override
    public int compareTo(Object o) {
        return this.id -  ( (Rabbit)o ).id;
    }
}

public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit(3));
        rabbits.add(new Rabbit(1));

        Collections.sort(rabbits); // DOES NOT COMPILE
        System.out.println(rabbits);

        Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
        Collections.sort(rabbits, c);
    Collections.reverse(rabbits);
        System.out.println(rabbits); // [Rabbit[id=1], Rabbit[id=3]]

        rabbits.sort(c);
    System.out.println(rabbits);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        numbers.add(-5);

        Collections.sort(numbers);
        System.out.println(numbers);

}
}