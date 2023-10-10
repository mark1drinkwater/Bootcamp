package OCP.Chapter5.root.overloading;

public class Ostrich {
    public void fly(int i) {
        System.out.print("int");
    }
    public void fly(long l) {
        System.out.print("long");
    }

    public static void walk(int[] ints) {}
    public static void walk(Integer[] integers) {}

    public static void main(String[] args) {
        var p = new Ostrich();
        p.fly(123);
        System.out.print("-");
        p.fly(123L);
        // Array types do not get autoboxed or autounboxed.
        walk(new int[] {4,5,6}); // This will NOT autobox to Integer.
    }
}