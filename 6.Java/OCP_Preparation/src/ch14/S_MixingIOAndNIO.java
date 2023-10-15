package ch14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class S_MixingIOAndNIO {
    private static void copyPath(Path input, Path output) throws IOException {
        try (var reader = Files.newBufferedReader(input);
             var writer = Files.newBufferedWriter(output)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();

            }
        }
    }

    public static void main(String[] args) throws IOException {
        Path input = Paths.get("/data/NIO2_Files/readMe.txt");
        Path newBufferedReader = Paths.get("/data/NIO2_Files/newBufferedWriter.txt");

        copyPath(input, newBufferedReader);
    }
}

