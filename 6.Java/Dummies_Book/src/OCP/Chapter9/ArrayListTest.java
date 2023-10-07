package OCP.Chapter9;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        strings.add("a");
        strings.add("c");
        strings.add("b");
        strings.add("b");

        System.out.println("Array list of type String");
        for (String s : strings)
            System.out.println(s);

        System.out.println("Array list of type Object (assumed default if no type is specified) ");

        var list = new ArrayList<>();
        list.add("a");
        for (Object o: list)
            System.out.println( (String)o  );
    }
}
