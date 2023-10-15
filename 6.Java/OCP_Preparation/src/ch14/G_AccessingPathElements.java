package ch14;

import java.nio.file.Path;

public class G_AccessingPathElements {
    /*
        The getFileName() method returns the Path element of the current file or directory.
        While getParent() returns the full path of the containing directory.
        The getParent() method returns null if operated on the root path or at the top of a relative path.
        The getRoot() method returns the root element of the file within the file system, or null if the path is a relative path.
     */

    public static void printPathInformation(Path path) {
        System.out.println("Filename is: " + path.getFileName());
        System.out.println("   Root is : " + path.getRoot());
        Path currentParent = path;
        while ((currentParent = currentParent.getParent()) != null)
            System.out.println("   Current parent is: " + currentParent);
        System.out.println();
    }

    public static void main(String[] args) {
        printPathInformation(Path.of("zoo"));
        printPathInformation(Path.of("/zoo/armadillo/shells.txt"));
        // The getParent() does not traverse relative paths outside the current working directory.
        printPathInformation(Path.of("./armadillo/../shells.txt"));
    }
}
