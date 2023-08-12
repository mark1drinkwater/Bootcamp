/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.markdrinkwater.d83527gc10.Chapter04;

/**
 *
 * @author Mark
 */
public class Exercise4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";
        String message = custName + " wants to purchase a " + itemDesc;

        double price = 19.99;
        double tax = 1.15;
        double total;
        
        int numOfItems = 3;

        message = custName + " wants to purchase " + numOfItems + " of " + itemDesc;
        
        System.out.println(message);
        
        total = price * numOfItems * tax;
        
        System.out.println("Total cost of tax is: R " + total);
    }
}
