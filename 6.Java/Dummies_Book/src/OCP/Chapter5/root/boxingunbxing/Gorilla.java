package OCP.Chapter5.root.boxingunbxing;

//As before, the same limitation around autoboxing and numeric promotion applies to
//        method calls. For example, the following does not compile:
public class Gorilla {
    public void rest(Long x) {
        System.out.print("long");
    }
    public static void main(String[] args) {
        var g = new Gorilla();
        //g.rest(8); // DOES NOT COMPILE
//    Java will cast or autobox the value automatically, but not both at the same time.

    }
}
