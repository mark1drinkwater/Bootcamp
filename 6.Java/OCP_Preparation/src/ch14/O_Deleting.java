package ch14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class O_Deleting {
    public static void main(String[] args) throws IOException {
        Files.createFile(Paths.get("/data/deleteMe.txt"));
        Files.delete(Paths.get("/data/deleteMe.txt"));

        // Throws an exception, if you try to delete a file that doesn't exist
//        Files.delete(Paths.get("/data/deleteMe.txt"));

        // Doesn't throw an exception
        Files.deleteIfExists(Paths.get("/data/deleteMe.txt"));
    }
}
