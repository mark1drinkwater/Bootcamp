package OCP.Chapter9;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CollectionEquality {
    public static void main(String[] args) {
        var list1 = List.of(1, 2);
        var list2 = List.of(2, 1);
        var set1 = Set.of(1, 2);
        var set2 = Set.of(2, 1);

        // Llists care about order, sets do not.
        System.out.println(list1.equals(list2)); // false
        System.out.println(set1.equals(set2)); // true
        System.out.println(list1.equals(set1)); // false

        var heights = new ArrayList<Integer>();
        // This is legal because null reference can be assigned to any reference variable
        int h = heights.get(0);
    }
}
