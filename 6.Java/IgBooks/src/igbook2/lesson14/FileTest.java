package igbook2.lesson14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileTest {
    public static void main(String[] args) {
        Path p = Paths.get("C:\\Users\\Mark\\Documents\\Bootcamp");
        System.out.format("Path %s exists: %b%n", p, Files.exists(p, LinkOption.NOFOLLOW_LINKS));
        // !Files.exists and Files.notExists are not the same.
        // If both return false, the existence of file or directory can't be determined.

        // To verify that  file can be accessed:
        System.out.format("Path is readable: %b", Files.isReadable(p));
        System.out.format("Path is writable: %b", Files.isWritable(p));
        System.out.format("Path is executable: %b", Files.isExecutable(p));

        // The isSameFile(p,p) tests to see whether 2 paths point to the same file

        // How to create files and directories:
        Path p2 = Paths.get("C:\\Users\\Mark\\Documents\\Bootcamp\\TestFolder");
        try {
            Files.createDirectories(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Two ways to delete files, directories
        // .delete() and .deleteIfExists()
        // Apparently should not throw an exception, yet it does.
        try {
            Files.deleteIfExists(p2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Copying a File or Directory
        // Files.copy(source, target, REAPLACE_EXISTING, NOFOLLOW_LINKS);
        // Files inside a directory are not cpied.

        // Moving a File or Directory
        // Moving a directory will not move the contents of the directory.
        // Files.move(source, target, REPLACE_EXISTING);

        // How to list the files in the current directory.
        try (Stream<Path> files = Files.list(p)) {
            files.forEach(line -> System.out.println(line));
        } catch (IOException e) {
            System.out.println("Message: " + e.getMessage());
        }

        // Walk the Directory Structure
        try (Stream<Path> files = Files.walk(p)) {
            files.forEach(line -> System.out.println(line));
        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
        }

    }
}
