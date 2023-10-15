package ch14.W_to_X;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class W_ReadInputIOStream {
    public static void main(String[] args) throws IOException {
//        var reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Please enter something: ");
//        String userInput = reader.readLine();
//        System.out.println("You entered: \"" + userInput+"\"");

//        try (var out = System.out) {}
//        System.out.println("Hello");
//
//        try (var err = System.err) {}
//        System.err.println("Hello");

        var reader2 = new BufferedReader(new InputStreamReader(System.in));
        try (reader2) {}
        String data = reader2.readLine(); // IOException
    }
}

class ConsoleTest {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String userInput = console.readLine();
            console.writer().println("You entered: " + userInput);
        } else {
            System.err.println("Console not available");
        }
    }
}