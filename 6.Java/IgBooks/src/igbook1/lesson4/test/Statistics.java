package igbook1.lesson4.test;

public class Statistics {
    // Image you want to calculate average...
    public float average(int x1, int x2) {
        return (x1 + x2) / 2;
    }

    public float average(int x1, int x2, int x3) {
        return (x1 + x2 + x3) / 3;
    }

    // This is getting tedious... luckily we have a better way
    // Java provides a feature called varags or variable arguments.
//    public float average(int... nums) {
//        int sum = 0;
//        for (int x : nums) { // iterate int array nums
//            sum += x;
//        }
//        return ((float) sum / nums.length);
//    }

    // NB: Varargs can also take no parameters -- an invocation of average() is legal
    // You will see varargs as an optional parameter used in NIO.2
    public float average(int... nums) {
        int sum = 0;
        float result = 0;
        if (nums.length > 0) {
            for (int x : nums) // iterage int array nums
                sum += x;
            result = (float) sum / nums.length;
        }
        return result;
    }

    public static void main(String[] args) {
        Statistics s = new Statistics();
        System.out.println(s.average(2,4,5,6,444,6,2,5,7,7,4,4,4,3));
    }
}
