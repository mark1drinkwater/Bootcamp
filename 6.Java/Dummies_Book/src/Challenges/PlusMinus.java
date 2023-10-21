package Challenges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for (int i : arr) {
            if (i > 0) {
                posCount++;
            } else if (i < 0) {
                negCount--;
            } else {
                zeroCount++;
            }
        }

        int totalCount = arr.size();

        System.out.printf("%.6f\n", (posCount*1.0/totalCount) );
        System.out.printf("%.6f\n", (negCount*1.0/totalCount ));
        System.out.printf("%.6f", (zeroCount*1.0/totalCount) );

    }

    public static void main(String[] args) {
        PlusMinus pm = new PlusMinus();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-4);
        list.add(3);
        list.add(-9);
        list.add(0);
        list.add(4);
        list.add(1);
        pm.plusMinus(list);
    }

}
