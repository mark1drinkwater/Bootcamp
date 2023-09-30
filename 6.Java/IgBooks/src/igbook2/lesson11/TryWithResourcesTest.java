package igbook2.lesson11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        System.out.println("About to open a file.");

        // try-with-resources Statement
        // Can eliminate the need for a lengthy finally block.
        // Resources opened by using try-with-resources statements are always closed
        // If a resource should be auto closed, its references must be declared within the try statement's parenthesis.
        // Multiple resources can be opened if they are separated by semi-colons.
        // If you open multiple resources, they should be closed in the opposite order in which you opened them.

        try (InputStream in = new FileInputStream("missingfile.txt")) {
            System.out.println("File open");
            int data = in.read();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Catching Multiple Exceptions
//        try {
//
//            // Multiple exception types are separated with a pipe
//        } catch (ClassNotFoundException | IOException e) {
//   The type alternatives that are separated with vertical vars can't have an inheritance
//        relationship. You can't list both FileNotFoundException and IOException in a multi-catch clause.
//        }

        // The exceptions that methods may throw must still be handled.
        // Declaring an exception just makes it someone else's job to handle them.
        try {
            int data = readByteFromFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // Declaring Exceptions
    public static int readByteFromFile() throws IOException {
        // Notice the lack of catch clauses 🤔
        // The try-with-resources statement is being used only to close resources.
        try (InputStream in = new FileInputStream("a.txt")) {
            System.out.println("File open");
            return in.read();
        }
    }

}
