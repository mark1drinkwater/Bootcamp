package igbook1.lesson7.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericArrayList {
    public static void main(String[] args) {
        List<Integer> partList = new ArrayList<>(3);

        partList.add(Integer.valueOf(1111));
        partList.add(Integer.valueOf(2222));
        partList.add(Integer.valueOf(3333));
//        partList.add("Bad Data"); // comiler error now

        Iterator<Integer> elements = partList.iterator();
        while (elements.hasNext()) {
            Integer partNumberObject = elements.next();
            int partNumber = partNumberObject.intValue();

            System.out.println("Part number: " + partNumber);
        }

        // Using the enhanced for loop aka for-each loop is much easier.
        for (Integer partNumberObj : partList) {
            int partNumber = partNumberObj; // Demos auto unboxing
            System.out.println("Part number: " + partNumber);
        }
    }
}
