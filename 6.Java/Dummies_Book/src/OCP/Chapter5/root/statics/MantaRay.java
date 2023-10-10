package OCP.Chapter5.root.statics;

public class MantaRay {
    private static String name = "Sammy";
    public static void first() { }

    public static void second() { }

    public void third() { System.out.print(name); }

    public static void main(String args[]) {
        first();
        second();
//        third(); // DOES NOT COMPILE
        MantaRay ray = new MantaRay();
        ray.third(); // can only access a non-static variable using the reference variable.
    }
}

