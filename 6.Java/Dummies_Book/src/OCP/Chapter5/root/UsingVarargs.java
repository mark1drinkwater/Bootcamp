package root;

public class UsingVarargs {

    public static void main(String[] args) {
        int[] data = {1,2,3};
        walk1(data);
//        walk1(1,4,5,66,443,12422,11,6623,74,88,99,11,333);
        walk2("Mark", 4, 6, 212, 12, 1);

//        walk1(1, null);
    }

    public static void walk1(int... steps) {
        for (int step : steps) {
            System.out.print(step + ",");
        }
        System.out.println();
    }

    public static void walk2(String name, int... steps) {
        System.out.println("My name is " + name);
        System.out.println("First element is " + steps[0]);
        for (int step : steps) {
            System.out.print(step + ",");
        }
        System.out.println();
        int array[] = steps;
        System.out.println("The length of the array is " + array.length);
    }

    // Java treats varargs as if it was an array.

}
