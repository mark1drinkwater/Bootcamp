package OCP.Chapter5.root.statics;

public class ZooPen {
    private static final int NUM_BUCKETS = 45;
    private static final String[] treats = new String[10];

    public static void main(String[] args) {
//        NUM_BUCKETS = 5; Does not compile.
        treats[0] = "popcorn"; // works
        // But can't assign a new reference variable.
//         treats = new String[20]; // won't compile
    }
}
