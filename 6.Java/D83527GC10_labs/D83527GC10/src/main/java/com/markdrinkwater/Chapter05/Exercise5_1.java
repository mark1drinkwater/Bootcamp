/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.markdrinkwater.d83527gc10.Chapter05;

/**
 *
 * @author Mark
 */
public class Exercise5_1 {

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
        int quantity = 3;        
        boolean outOfStock = false;

        message = custName + " wants to purchase " + quantity + " " + itemDesc;
        
        if (quantity > 1) {
            message += "s";
        }
        
        if (outOfStock) {
            System.out.println("The item is unavailable.");
        } else {
            total = price * quantity * tax;
            System.out.println(message);                       
            System.out.println("Total cost of tax is: R " + total);            
        }
        

    }
}
