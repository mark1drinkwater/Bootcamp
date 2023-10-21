package Geeks.classes;

public class Q12 {
}

class Good {
    private int m;

    public static void main(String[] args) {
        Good m1 = new Good(22);
        Good m2 = new Good(22);

        Object s1 = new Good(22);
        Object s2 = new Good(22);

        // Calls the declared equals
        System.out.println(m1.equals(m2));
        // Calls object equals
        System.out.println(m1.equals(s2));
        // Calss object equaks
        System.out.println(m1.equals(s2));
        // Calls object equals
        System.out.println(s1.equals(m2));
        // Calls object equals
    }

    public Good(int m) {
        this.m = m;
    }

    public boolean equals(Good n) {
        System.out.println("n.m: " + n.m + "    m: " + m);
        return n.m == m;
    }
}