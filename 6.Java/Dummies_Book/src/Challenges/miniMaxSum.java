package Challenges;

import java.util.Arrays;
import java.util.List;

public class miniMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int smallest = Integer.MAX_VALUE;
        int smallestIndex = 0;
        int largest = Integer.MIN_VALUE;
        int largestIndex = 0;

        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get(i);
            if (value > largest) {
                largest = value;
                largestIndex = i;
            }
            if (value < smallest) {
                smallest = value;
                smallestIndex = i;
            }
        }

        long minSum = 0;
        long maxSum = 0;

        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get(i);
            if (i != smallestIndex)
                maxSum += value;
            if (i != largestIndex)
                minSum += value;
        }
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        miniMaxSum(Arrays.asList(arr));
    }

}
