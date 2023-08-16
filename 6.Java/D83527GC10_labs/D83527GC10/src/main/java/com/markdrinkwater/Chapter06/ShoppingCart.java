/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.markdrinkwater.Chapter06;

/**
 *
 * @author Mark
 */
// Exercise 6.2
public class ShoppingCart {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Item item1 = new Item();
        Item item2 = new Item();
        
        item1.descr = "Pizza";
        item2.descr = "Ice-cream";
        
        System.out.println("Item 1 description: " + item1.descr);
        System.out.println("Item 2 description: " + item2.descr);
        
        item2 = item1;
        System.out.println("Item 2 description after re-assignment: " + item2.descr);
        System.out.println(item2.descr);
    }
    
}
