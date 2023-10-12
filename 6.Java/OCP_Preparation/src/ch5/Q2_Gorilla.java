package ch5;

//As before, the same limitation around autoboxing and numeric promotion applies to
//        method calls. For example, the following does not compile:
public class Q2_Gorilla {
    public void rest(Long x) {
        System.out.print("long");
    }
    public static void main(String[] args) {
        var g = new Q2_Gorilla();
        //g.rest(8); // DOES NOT COMPILE
//    Java will cast or autobox the value automatically, but not both at the same time.

    }
}
