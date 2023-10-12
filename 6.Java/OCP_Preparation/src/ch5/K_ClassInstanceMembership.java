package ch5;

public class K_ClassInstanceMembership {
}


class MantaRay {
    private final String name = "Sammy";

    public static void first() {
    }

    public static void second() {
    }

    public static void main(String[] args) {
        first();
        second();
//        third(); // DOES NOT COMPILE
    }

    public void third() {
        System.out.print(name);
    }
}

class Gorilla {
    public static int count;
//    public static double average = total / count; // DOES NOT COMPILE
    public int total;

    public static void addGorilla() {
        count++;
    }

    public static void announceBabiesToEveryone() {
        addGorilla();
//        babyGorilla(); // DOES NOT COMPILE
    }

    public void babyGorilla() {
        count++;
    }

    public void announceBabies() {
        addGorilla();
        babyGorilla();
    }
}


class Counter {
    private static int count;
    public Counter() { count++; }
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count); // 3
    }
}