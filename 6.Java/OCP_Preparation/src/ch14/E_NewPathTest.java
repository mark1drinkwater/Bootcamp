package ch14;

import java.nio.file.Path;
import java.nio.file.Paths;

public class E_NewPathTest {
    public static void main(String[] args) {
        // Interacting with NIO.2 Paths
        System.out.println(Path.of("/chapter5.js").getParent().normalize().toAbsolutePath());

        // These methods don't consider the root part of the path.
        // Extracting the elements from a path.
        Path path = Paths.get("/land/hippo/harry.happy");
        System.out.println("The Path Name is: " + path);
        for (int i=0; i < path.getNameCount(); i++)
            System.out.println("   Element " + i + " is: " + path.getName(i));

        var p = Path.of("/");
        System.out.print(p.getNameCount()); // 0
//        System.out.print(p.getName(0)); // IllegalArgumentException
    }
}
