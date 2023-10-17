package com.example.lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class DirFind {
    
    public static void main(String[] args) {
        
// Remove comments
        try
        ( Stream<Path> files = 
              Files.find(Paths.get("C:\\Users"), 9, (p,a) -> a.isDirectory()) )
        { // Add try with resources
            
            System.out.println("\n=== Find all dirs ===");
            // Print out directory list here
            files.forEach(System.out::println);
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    } 
}
