package OCP.Chapter9.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,9,1,8);
        Collections.sort(list); // [1, [2], 6, 8, 9]  1 * -1 -1 = -2
        System.out.println(Collections.binarySearch(list, 6)); // 1
        System.out.println(Collections.binarySearch(list, 3)); // -2

        var names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c = Comparator.reverseOrder();
        var index = Collections.binarySearch(names, "Hoppy", c);
        System.out.println(index);
    }
}
