package ch14.AdvancedAPIs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class D_WalkSmarter {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/Users/Mark/Documents/Bootcamp/6.Java");

        long minSize = 1_000;
        try (var s = Files.find(path, 10,
                (p, a) -> a.isRegularFile()
                        && p.toString().endsWith(".java")
                        && a.size() > minSize)) {
            s.forEach(System.out::println);
        }
    }
}
