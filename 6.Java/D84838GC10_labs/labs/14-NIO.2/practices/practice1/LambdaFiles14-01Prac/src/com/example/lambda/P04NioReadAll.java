package com.example.lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author oracle
 */
public class P04NioReadAll {
  public static void main(String[] args) {
        
    Path file =  Paths.get("hamlet.txt");
    List<String> fileArr;
    

    try{
        // Read fileinto array here
        fileArr = Files.readAllLines(file);

        System.out.println("\n=== Lord Count ===");
        long wordCount = 0; // Replace with your pipeline
        wordCount = fileArr.stream()
                        .flatMap(line -> Stream.of(line.split(" ")))
                        .filter(t -> t.contains("lord"))
                        .peek(System.out::println)
                        .count();
        
        System.out.println("Word count: " + wordCount);

        System.out.println("\n=== Prison Count ===");
        wordCount = 0; // Replace with your pipeline
        wordCount = fileArr.stream()
            .flatMap(line -> Stream.of(line.split(" ")))
            .filter(word -> word.contains("prison"))
            .peek(word -> System.out.println(word))
            .count();
        
        System.out.println("Word count: " + wordCount);            

    }catch (IOException e){
        System.out.println("Error: " + e.getMessage());
    }

  } 
}
