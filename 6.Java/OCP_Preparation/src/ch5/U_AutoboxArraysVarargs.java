package ch5;

public class U_AutoboxArraysVarargs {
}

class Kiwi {
    public void fly(int numMiles) {}
    public void fly(Integer numMiles) {}
    //////////////
    public static void walk(int[] ints) {}
    public static void walk(Integer[] integers) {}
}

class Toucan {
    public static void fly1(int[] lengths) {}
    public static void fly2(int... lengths) {} // DOES NOT COMPILE

    public static void main(String[] args) {
        fly1(new int[] { 1, 2, 3 }); // Allowed to call either fly() method
        fly2(new int[] { 1, 2, 3 });

//        fly1(1, 2, 3); // Does not compile
        fly2(1, 2, 3);
        //fly(1, 2, 3); // Allowed to call only the fly() method using varargs
    }
}