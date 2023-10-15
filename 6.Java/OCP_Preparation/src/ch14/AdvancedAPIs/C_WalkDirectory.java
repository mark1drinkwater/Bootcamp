package ch14.AdvancedAPIs;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C_WalkDirectory {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("/data/zoo.txt");
        Path dir = Paths.get("/Users/Mark/Downloads");

        var w = new C_WalkDirectory();
        System.out.println("Size: " + w.getSize(file));
        System.out.println("Size: " + w.getPathSize(dir));
    }

    private long getSize(Path p) {
        try {
            return Files.size(p);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
    public long getPathSize(Path source) throws IOException {
        try (var s = Files.walk(source, 5)) {
            return s.parallel()
                    .filter(p -> !Files.isDirectory(p))
                    .peek(System.out::println)
                    .mapToLong(this::getSize)
                    .sum();
        }
    }

}
