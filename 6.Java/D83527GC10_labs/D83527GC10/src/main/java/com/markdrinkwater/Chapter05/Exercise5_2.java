/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.markdrinkwater.Chapter05;

/**
 *
 * @author Mark
 */
public class Exercise5_2 {
    public static void main(String args[]) {
        
        String custName = "Mary Smith";
        String message;
        
        String[] names = {"Ferrari", "Piano", "Mahogany Table", "Leather Lounge Suit"};
        
        message = custName + " wants to purchase " + names.length + " items.";
        System.out.println("Third element of names array: " + names[2]);
        System.out.println(message);

    }
}
