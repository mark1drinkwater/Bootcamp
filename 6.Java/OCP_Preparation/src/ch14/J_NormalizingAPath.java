package ch14;

import java.nio.file.Path;
import java.nio.file.Paths;

public class J_NormalizingAPath {
    // normalize() methods eliminates unnecessary redundancies in a path (path symbols: . and ..)
    public static void main(String[] args) {
        var p1 = Path.of("./armadillo/../shells.txt");
        System.out.println(p1.normalize()); // shells.txt

        var p2 = Path.of("/cats/../panther/food");
        System.out.println(p2.normalize()); //   /panther/food

        var p3 = Path.of("../../fish.txt");
        // It doesn't completely remove all the path symbols, only the ones that can be reduced.
        System.out.println(p3.normalize()); //    ../../fish.txt


        // Comparing equivalent paths
        var p4 = Paths.get("/pony/../weather.txt");
        var p5 = Paths.get("/weather.txt");
        System.out.println(p4.equals(p5));  // false
        System.out.println(p4.normalize().equals(p5.normalize())); // true
    }
}
