package igbook2.lesson11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryCatchTest {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            System.out.println("About to open a file");
            in = new FileInputStream("missingfile");
            System.out.println("File open");
            int data = in .read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Unhandled error occurred in: " + e.getClass().getName() );
            System.out.println("Quitting");
        } finally {
            if (in != null) {
                // A try catch block inside a try catch block 🤯
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println("Failed to close file.");
                }
            }
        }
    }
}
