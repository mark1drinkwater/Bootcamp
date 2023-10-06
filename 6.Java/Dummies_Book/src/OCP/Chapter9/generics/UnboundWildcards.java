package OCP.Chapter9.generics;

import java.util.ArrayList;
import java.util.List;

public class UnboundWildcards {
    public static void printList(List<?> list) {
        for (Object x: list)
            System.out.println(x);
    }
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");

        printWhatever("Print me if you can.");

        printList(keywords); // DOES NOT COMPILE
    }

    public static void printWhatever(Object o) {
        System.out.println(o);
    }
}
