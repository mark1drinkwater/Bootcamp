package com.markdrinkwater.Chapter11.Exercise4;

import java.util.ArrayList;

public class ShoppingCart {
    public static void main(String[] args){   
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> cart = new ArrayList();
        cart.add("Watch");
        cart.add("Car");
        cart.add("Chocolates");
        
        // add (insert) another element at a specific index
        cart.add(2, "RTX 4090");

	// Check for the existence of a specific String element.  
        //   If it exists, remove it.
        if (cart.contains("Car")) {
            cart.remove("Car");
        }
        
        System.out.println(cart);
    }
}
