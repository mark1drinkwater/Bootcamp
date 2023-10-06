package OCP.Chapter9.generics;

import java.util.ArrayList;
import java.util.List;

public class UpperboundWildcards {
    public static long total(List<? extends Number> list) {
        long count = 0;
        for (Number number: list)
            count += number.longValue();
        return count;
    }

    public static void main(String[] args) {
        ArrayList<? extends Number> list1 = new ArrayList<Double>();
        ArrayList<? extends Number> list2 = new ArrayList<Integer>();
        // ArrayList<? extends Number> list3 = new ArrayList<String>(); DOES NOT COMPILE. Because a String is NOT a Number.

        total(list1);
        total(list2);
    }
}
