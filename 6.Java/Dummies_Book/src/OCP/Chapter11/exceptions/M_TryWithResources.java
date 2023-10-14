package OCP.Chapter11.exceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class M_TryWithResources {
    public static void main(String[] args) {
        FileInputStream is = null;
        try {
            is = new FileInputStream("myFile.txt");
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    // Functionally, they are similar but our new version has half as many lines.
    public void readFile(String file) {
        try (FileInputStream is = new FileInputStream("myfile.txt")) {
            // Read file data
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readWriteFile(String file) {
        // Resources are closed here in reverse order.
        try (FileInputStream in = new FileInputStream("data.txt");
             FileOutputStream out = new FileOutputStream("output.txt")
             // Protected code
        ) {

        } catch (IOException e) {
            // Exception handler
        }
    }
}

class M_2 {
    public static void main(String[] args) throws IOException {
        try (var in = new FileInputStream("data.txt");
             var out = new FileOutputStream("output.txt")) {
                // Protected code
        }
    }
}


















