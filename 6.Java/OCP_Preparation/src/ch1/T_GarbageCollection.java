package ch1;

public class T_GarbageCollection {
}

class Scope {
    public static void main(String[] args) {
        String one, two;
        one = "a";
        two = "b";
        one = two;
        String three = one;
        one = null;
    }
}