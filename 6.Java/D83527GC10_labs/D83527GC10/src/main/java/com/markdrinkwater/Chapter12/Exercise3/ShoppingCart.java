package com.markdrinkwater.Chapter12.Exercise3;

public class ShoppingCart {
    public static void main(String[] args) {
         // declare and instantiate a Shirt object using an Item reference type
        //Item myItem = new Shirt(49.99, 'M', 'R');
        Item myItem = new Item("Tie", 19.99);
        
        // call the display method on the object, then the getColor method
        myItem.display();
        
        if (myItem instanceof Shirt) {
            String myColor = ((Shirt) myItem).getColor();           
            
            System.out.println("The shirt color is: " + myColor);
        } else {
            System.out.println("The item is not a shirt.");
        }
        
    }
}
