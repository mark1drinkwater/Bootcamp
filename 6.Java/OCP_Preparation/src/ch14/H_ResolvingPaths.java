package ch14;

import java.nio.file.Path;

public class H_ResolvingPaths {
    public static void main(String[] args) {
        Path path1 = Path.of("/cats/../panther");
        Path path2 = Path.of("food");
        // Resolve basically concatenates paths together
        // Like other methods, it doesn't clean up path symbols (it keeps . and ..)
        // In this case one is absolute, one is relative
        System.out.println(path1.resolve(path2));

        // Remember absolute paths start with a /
        // So in this case both are absolute paths.
        Path path3 = Path.of("/turkey/food");
        System.out.println(path3.resolve("/tiger/cage"));
    }
}
