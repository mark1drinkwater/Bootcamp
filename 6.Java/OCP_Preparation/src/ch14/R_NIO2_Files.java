package ch14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class R_NIO2_Files {
    private static void copyPathAsString(Path input, Path output) throws IOException {
        String string = Files.readString(input);
        Files.writeString(output, string);
    }
    private static void copyPathAsBytes(Path input, Path output) throws IOException {
        byte[] bytes = Files.readAllBytes(input);
        Files.write(output, bytes);
    }
    private static void copyPathAsLines(Path input, Path output) throws IOException {
        List<String> lines = Files.readAllLines(input);
        Files.write(output, lines);
    }
    private static void readLazily(Path path) throws IOException {
        try (Stream<String> s = Files.lines(path)) {
            s.forEach(System.out::println);
        }
    }

    private static void readLazilyFiltered(Path path) throws IOException {
        try (var s = Files.lines(path)) {
            s.filter(f -> f.startsWith("WARN:"))
                    .map(f -> f.substring(5))
                    .forEach(System.out::println);
        }
    }

    public static void main(String[] args) throws Exception {
        Path input = Paths.get("/data/NIO2_Files/readMe.txt");
        Path sharks = Paths.get("/data/NIO2_Files/sharks.log");

        Path outputString = Paths.get("/data/NIO2_Files/outputString.txt");
        Path outputBytes = Paths.get("/data/NIO2_Files/outputBytes.txt");
        Path outputAllLines = Paths.get("/data/NIO2_Files/outputAllLines.txt");


        copyPathAsString(input, outputString);
        copyPathAsBytes(input, outputBytes);
        copyPathAsLines(input, outputAllLines);
        readLazily(input);
        System.out.println("\nRead Lazy Filtered:");
        readLazilyFiltered(sharks);
    }

    /*
    For the exam, you need to know the difference between readAllLines() and lines().
    Both of these examples compile and run:
    Files.readAllLines(Paths.get("birds.txt")).forEach(System.out::println);
    Files.lines(Paths.get("birds.txt")).forEach(System.out::println);
    The first line reads the entire file into memory and performs a print operation on the result,
    while the second line lazily processes each line and prints it as it is read. The advantage of
    the second code snippet is that it does not require the entire file to be stored in memory
    at any time.
     */

    public void readLinesVsAllLines() throws IOException {
        Files.readAllLines(Paths.get("birds.txt"))
                .stream()// The readAllLines returns a List<String> so it needs to be converted to a stream.
                .filter(s -> s.length()> 2)
                .forEach(System.out::println);
    }
}
