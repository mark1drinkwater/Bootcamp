/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package igbooks.igbook1.lesson7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Mark
 */
public class SetExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Set<String> set = new TreeSet<>();
        Set<String> set = new HashSet<>();
        
        set.add("A");
        set.add("D");
        set.add("B");
        set.add("B"); // not added, only unique
        
        for (String item:set) {
            System.out.println("Item: " + item); 
        }
    }
    
}
