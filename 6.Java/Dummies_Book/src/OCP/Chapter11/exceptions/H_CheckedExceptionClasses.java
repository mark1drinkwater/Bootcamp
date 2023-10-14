package OCP.Chapter11.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class H_CheckedExceptionClasses {
}

// FileNotFoundException: Subclass of IOException when you try to reference a file that does not exist.
class FileNotFoundExceptionTest {

    public static void main(String[] args) {
        String filePath = "nonexistentfile.txt";
        // Checked Exceptions must either be:
        // Handled in a try-catch block
        // Or declared in the method signature.
        try {
            FileReader fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        }
    }
}