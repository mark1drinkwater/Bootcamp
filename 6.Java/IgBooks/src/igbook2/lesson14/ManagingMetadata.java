package igbook2.lesson14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManagingMetadata {
    public static void main(String[] args) {
        Path p = Paths.get("C:\\Users\\Mark\\Documents\\Bootcamp\\6.Java\\IgBooks\\src\\test.txt");
        try {
            System.out.printf("Size %d", Files.size(p) );
            System.out.printf("Is Directory %b", Files.isDirectory(p) );
            System.out.printf("Is RegularFile %b", Files.isRegularFile(p) );
            System.out.printf("Is Symbolic Link %b", Files.isSymbolicLink(p) );
            System.out.printf("Is hidden? %b", Files.isHidden(p) );
            System.out.println(Files.getLastModifiedTime(p) );
            System.out.printf("Size %d", Files.size(p) );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
