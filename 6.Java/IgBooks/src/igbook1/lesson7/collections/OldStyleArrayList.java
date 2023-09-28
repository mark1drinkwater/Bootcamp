package igbook1.lesson7.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OldStyleArrayList {
    public static void main(String[] args) {
        /// Java example using syntax prior to Java 1.5
        // Disadvantage: you could end up adding different types in a list.
        // Then when you work with the list you'd run into runtime exceptions.
        List<Integer> partList = new ArrayList<>(3);
//        List<int> partList2 = new ArrayList<>(3);

        partList.add(new Integer(1111));
        partList.add(new Integer(2222));
        partList.add(new Integer(3333));
//        partList.add("Oops a string!");

        Iterator elements = partList.iterator();
        while (elements.hasNext()) {
            Integer partNumberObject = (Integer)(elements.next());
            int partNumber = partNumberObject;

            System.out.println("Part number: " + partNumber);
        }

        for (int e : partList) {
            System.out.println("Part number: " + e);
        }

    }
}
