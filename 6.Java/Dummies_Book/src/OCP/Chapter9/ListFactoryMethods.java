package OCP.Chapter9;

import java.util.Arrays;
import java.util.List;

public class ListFactoryMethods {
    public static void main(String[] args) {
        String[] array = new String[] {"a", "b", "c"};
        List<String> asList = Arrays.asList(array);
        List<String> of = List.of(array);
        List<String> copy = List.copyOf(asList);

        array[0] = "z";

        System.out.println(Arrays.toString(array));
        System.out.println(asList);
        System.out.println(of);
        System.out.println(copy);

        asList.set(0, "x");
        System.out.println(Arrays.toString(array));

        // Runtime error, can't add or remove elements from an Array.asList But can modify.
        asList.add("y");
    }
}
