package com.example.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class DirList {
  public static void main(String[] args) {

// remove comments
    try ( Stream<Path> files = Files.list(Paths.get("C:\\Users")) )
    { // Add Try with resources here
        

        System.out.println("\n=== Dir list ===");
        // Print directory list here
        files
            .forEach(System.out::println);
    
    }catch (IOException e){
        System.out.println("Error: " + e.getMessage());
    }

  } 
}
