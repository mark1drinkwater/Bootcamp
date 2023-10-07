package OCP.Chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethodTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("SD");
        list.add(0, "NY");
        list.set(1, "FL");
        System.out.println(list.get(0));
        System.out.println(list);
        list.remove("NY");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
//        list.set(0, "?");

        var numbers = Arrays.asList(1, 2, 3);
        numbers.replaceAll(x -> x * 2);
        System.out.println(numbers);

        List<String> list2 = new ArrayList<>();
        list2.add("hawk");
        list2.add("robin");
        Object[] objectArray = list2.toArray();
        String[] stringArray = list2.toArray(new String[0]);
        System.out.println(Arrays.toString(objectArray));
        System.out.println(Arrays.toString(stringArray));
        System.out.println("Clearing your list");
        list2.clear();
        System.out.println(Arrays.toString(objectArray));
        System.out.println(Arrays.toString(stringArray));
    }
}
