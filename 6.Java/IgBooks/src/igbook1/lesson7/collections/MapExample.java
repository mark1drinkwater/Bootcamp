/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package igbook1.lesson7.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Mark
 */
public class MapExample {

    public static void main(String[] args) {
        Map<String,String> partList = new TreeMap<>();

        Map<Integer, String> partList2 = new TreeMap<>();
        partList2.put(5, "Apple");

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
