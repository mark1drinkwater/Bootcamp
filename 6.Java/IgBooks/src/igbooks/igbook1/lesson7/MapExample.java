/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package igbooks.igbook1.lesson7;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Mark
 */
public class MapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String,String> partList = new TreeMap<>();
        partList.put("S001", "Blue Polo Shirt");
        partList.put("S002", "Black Polo Shirt");
        partList.put("H01", "Duke Hat");
        
        partList.put("S002", "Black T-Shirt"); // Overwrite the value
        Set<String> keys = partList.keySet();
        
        System.out.println("=== Part List ===");
        for (String key: keys) {
            System.out.println("Part#: " + key + " " + partList.get(key) );
        }
        
    }
    
}
