/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mark
 */
public class ExceptionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Because the compiler didn't force you to handle or declare the
        // ArrayIndexOutOfBoundsException, it's an unchecked exception.
        // Typically you should not use a try-catch block to deal with an unchecked exception.
        
//        try {
//            System.out.println("Reading from file:" + args[0]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("No file specified, quitting!");
//            System.exit(1);
//        }
        

        try ( BufferedReader b = new BufferedReader(new FileReader(args[0])))   {            
            String s = null;           
            while( (s = b.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found:" + args[0] );
            System.exit(1);
        } catch (IOException ex) {
            System.out.println("Error reading file:" + ex.getMessage() );
            System.exit(1);
        }
        
    }
    
}
