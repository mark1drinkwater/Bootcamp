package ch14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class L_CreateMoveDelete {
    public static void main(String[] args) throws IOException {
        // createDirectory() will create a directory and throw an exception if it already exists
        Files.createDirectory(Path.of("/data/buffalo"));
        // whereas this one, will do nothing if it already exists.
        Files.createDirectories(Path.of("/data/bison/field"));

        ////////////////////////////////////////////////////////////////////////////
        // Copying Data
        copyPath(Paths.get("/data/zoo.txt"), Paths.get("/Users/Mark/Desktop/zoo.txt"));

        // Copying and Replacing Files:
        // Without this, it throws an exception if the file already exists.
        Files.copy(Paths.get("/data/zoo.txt"), Paths.get("/Users/Mark/Desktop/zoo.txt"),
                StandardCopyOption.REPLACE_EXISTING);
    }

    // A deep copy, requires recursion:
    public static void copyPath(Path source, Path target) {
        try {
            Files.copy(source, target);
            if (Files.isDirectory(source))
                try (Stream<Path> s = Files.list(source)) {
                    s.forEach(p -> copyPath(p, target.resolve(p.getFileName())));
                } catch (IOException e) {
                    System.out.println(e);
                }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
