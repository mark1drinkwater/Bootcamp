//package igbook2.lesson11;

public class Invariant {
    static void checkNum(int num) {
        int x = num;

        if (x > 0) {
            System.out.print("Number is positive" + x);
        } else if (x == 0) {
            System.out.print("Number is zero" + x);
        } else {
            assert (x < 0);
            System.out.println("Number is negative");
        }
    }

    public static void main(String[] args) {
        checkNum(4);
        checkNum(0);
        checkNum(-4);
    }

}
