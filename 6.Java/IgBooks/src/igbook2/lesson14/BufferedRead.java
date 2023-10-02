package igbook2.lesson14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedRead {
    public static void main(String[] args) {
        try (BufferedReader bReader =
                new BufferedReader(new FileReader("C:\\Users\\Mark\\Documents\\Bootcamp\\6.Java\\IgBooks\\src\\test.txt"))) {
            bReader.lines()
                    .forEach(line -> System.out.println("Line: " + line));
        } catch (IOException e) {
            System.out.println("Message: " + e.getMessage());
        }
    }
}
