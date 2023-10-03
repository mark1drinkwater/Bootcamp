package igbook2.lesson14;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathRedundancies {
    public static void main(String[] args) {
        String notNormalised = "\\home\\.\\clarence\\..\\peter\\foo";
        Path p = Paths.get(notNormalised);
        System.out.println(notNormalised);
        Path normalizedPath = p.normalize();
        System.out.println(normalizedPath);
        // Normalize does not check the file system when it cleans up a path.
        // It is a purely syntactic operation.

        // The element name closest to the root has index 0.
        // The element farthest from the root has index count-1
        Path p2 = normalizedPath.subpath(1, 3);
        System.out.println("Sub path:" + p2);

        // The resolve method is ued to combine paths.
        Path p3 = Paths.get("/home/clarence/foo");
        p3.resolve("bar"); // Returns /home/clarence/foo/bar

        // The Path interface is "link aware."
        // Detects what to do when a symbolic link is encountered


    }
}
