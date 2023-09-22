package OCP.Chapter4;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        int[] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");

        System.out.println(numbers);

        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String s : strings)
            System.out.print(s + " ");

        int[] numbers2 = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers2, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers2, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers2, 1)); // -1 {0 - 1}
        System.out.println(Arrays.binarySearch(numbers2, 3)); // -2 { 1 * -1 -1} -2
        System.out.println(Arrays.binarySearch(numbers2, 9)); // -5 { 4 * -1 -1} -5

//
//        java.util.Arrays.sort (numbers);
//        for (int i = 0; i < numbers.length; i++)
//            System.out.print(numbers[i] + " ");

    }

}
