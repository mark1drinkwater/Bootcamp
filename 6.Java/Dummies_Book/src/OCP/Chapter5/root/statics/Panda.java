package OCP.Chapter5.root.statics;

public class Panda {
    final static String name = "Ronda";
    static final int bamboo;
//    static final double height;

    // does not compile because only bamboo is initialised not the height.
    static {
        bamboo = 5;
        // would work then: height = 5;
    }

}
