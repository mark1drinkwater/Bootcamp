package ch14;

import java.nio.file.Paths;

public class F_SubPaths {
    // The beginIndex is inclusive
    // The endIndex is exclusive
    // Similar to how String's substring() works
    public static void main(String[] args) {
        var p = Paths.get("/mammal/omnivore/racoon.image");
        System.out.println("Path is: " + p);
        for (int i = 0; i < p.getNameCount(); i++) {
            System.out.println("    Element  " + i + " is: " + p.getName(i));
        }

        System.out.println();
        System.out.println("subpath(0,3): " + p.subpath(0,3));
        System.out.println("subpath(1,2): " + p.subpath(1,2));
        System.out.println("subpath(1,3): " + p.subpath(1,3));

        // Like getNameCount() and getName(), subpath() is zero-indexed and doesn't include the root
//        var q = p.subpath(0, 4);  // IllegalArgumentException
        var x = p.subpath(1, 1);  // IllegalArgumentException
    }
}
