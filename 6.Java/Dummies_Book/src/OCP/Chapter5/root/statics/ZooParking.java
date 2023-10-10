package OCP.Chapter5.root.statics;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static java.lang.Math.random;
import static java.lang.Math.PI;

public class ZooParking {
    public static void main(String[] args) {
//        List<String> list = Arrays.asList("one", "two");

        // Static import allows you to use the method without referring the class name
        asList("one", "two");

        System.out.println("Random: " + random());
        System.out.println("PI: " + PI);
    }
}
