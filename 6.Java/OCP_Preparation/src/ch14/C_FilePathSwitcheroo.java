package ch14;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class C_FilePathSwitcheroo {
    public static void main(String[] args) {
        // Since File & Path both reference locations on disk, it is helpful to convert between them
        File file = new File("C:/Users/Mark/Documents/Bootcamp/2.JavaScript/class/Chapter 5/chapter5.js");
        Path nowPath = file.toPath();
        File backToFile = nowPath.toFile();

        System.out.println("File: " + file);
        System.out.println("Path: " + nowPath);
        System.out.println("File: " + backToFile);

        ////////////////////////////////////////////////////////////////////////////////////////
        // Obtaining a Path from the FileSystems class
        Path zooPath1 = FileSystems.getDefault()
                .getPath("C:/Users/Mark/Documents/Bootcamp/2.JavaScript/class/Chapter 5/chapter5.js");
        Path zooPath2 = FileSystems.getDefault()
                .getPath("C:/Users/Mark/Documents","Bootcamp", "2.JavaScript", "class/Chapter 5", "chapter5.js");
        System.out.println(zooPath1);
        System.out.println(zooPath2);
    }
}
