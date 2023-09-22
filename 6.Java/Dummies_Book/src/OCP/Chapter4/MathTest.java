package OCP.Chapter4;

public class MathTest
{
    public static void main(String[] args) {
        int first = Math.max(3, 7); // 7
        int second = Math.min(7, -9); // -9
        System.out.println(first);
        System.out.println(second);

        long low = Math.round(123.45); // 123
        long high = Math.round(123.50); // 124
        int fromFloat = Math.round(123.45f); // 123

        System.out.println(low);
        System.out.println(high);
        System.out.println(fromFloat);

        double c = Math.ceil(3.00001); // 4.0
        double f = Math.floor(3.999999999999999); // 3.0

        System.out.println(c);
        System.out.println(f);

        double squared = Math.pow(5, -2); // 25.0

        System.out.println(squared);

        double num = Math.random();
        System.out.println(num);
    }
}
