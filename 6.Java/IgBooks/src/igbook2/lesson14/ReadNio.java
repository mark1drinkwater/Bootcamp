package igbook2.lesson14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadNio {
    public static void main(String[] args) {

        try (Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Mark\\Documents\\Bootcamp\\6.Java\\IgBooks\\src\\test.txt"))) {
            lines.forEach(line -> System.out.println("Line: " + line));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
