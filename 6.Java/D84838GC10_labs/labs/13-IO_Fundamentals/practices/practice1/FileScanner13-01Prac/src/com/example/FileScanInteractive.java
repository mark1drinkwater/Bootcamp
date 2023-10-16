package com.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileScanInteractive {

    public int countTokens(String file, String search) throws IOException {
        int instanceCount = 0;
        try (FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                Scanner s = new Scanner(br)) {
            s.useDelimiter("\\W");
            while (s.hasNext()) {
                if (search.equalsIgnoreCase(s.next().trim())) {
                    instanceCount++;
                }
            }
        } // try-with-resources will close the connections
        return instanceCount;
    }

    public static void main(String[] args) {
        
        String s = "";
        String fileName = "C:\\Users\\Mark\\Documents\\Bootcamp\\6.Java\\D84838GC10_labs\\labs\\13-IO_Fundamentals\\practices\\practice1\\FileScanner13-01Prac\\src\\com\\example\\instructions.txt";
        FileScanInteractive fsi = new FileScanInteractive();
        
        try (
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                ) {
//            s = in.readLine().trim();
            
            while (s.equalsIgnoreCase("q")) {
                System.out.println("Enter the search string or q to exit.");
                s = in.readLine().trim();
                
                if (s.equalsIgnoreCase("q"))
                    break;
                
                int count = fsi.countTokens(fileName, s);
                System.out.println("The word \"" + s + "\" appears " + count + " times in the file." );
            }

        } catch (IOException ex) {
            System.out.println("Exception e " + ex);
            System.exit(-1);
        } 
        
        
    }
}