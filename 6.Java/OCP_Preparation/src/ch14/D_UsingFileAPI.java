package ch14;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class D_UsingFileAPI {
    public static void main(String[] args) throws IOException {
        io("C:\\data\\zoo.txt");
        System.out.println();
        io("C:\\data");
        System.out.println();
        io("C:\\doesnotexist");
        nio2();
    }

    public static void io(String pathName) {
        var file = new File(pathName);
        if (file.exists()) {
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Parent Path: " + file.getParent());
            if (file.isFile()) {
                System.out.println("Size: " + file.length());
                System.out.println("Last Modified: " + file.lastModified());
            } else {
                for (File subFile : file.listFiles()) {
                    System.out.println(" " + subFile.getName());
                }
            }
        } else {
            System.out.println("File does not exist.");
        }
    }

    ///////////////////////////////////////////////////////////////
    // Same program using only NIO.2
    public static void nio2() throws IOException {
        var path = Path.of("C:\\data\\zoo.txt");
        if (Files.exists(path)) {
            System.out.println("Absolute Path: " + path.toAbsolutePath());
            System.out.println("Is Directory: " + Files.isDirectory(path));
            System.out.println("Parent Path: " + path.getParent());
            if (Files.isRegularFile(path)) {
                System.out.println("Size: " + Files.size(path));
            }
            System.out.println("Last Modified: "
                    + Files.getLastModifiedTime(path));
        } else {
            try (Stream<Path> stream = Files.list(path)) {
                stream.forEach(p ->
                        System.out.println(" " + p.getName(0)) );
            }
        }
    }
}