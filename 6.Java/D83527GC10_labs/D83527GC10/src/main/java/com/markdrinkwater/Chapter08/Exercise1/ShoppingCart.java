
package com.markdrinkwater.Chapter08.Exercise1;

public class ShoppingCart {
    public static void main(String[] args){
        Item item1 = new Item();
        
        // Call the setColor method on item1. Print the new color value from
        //   item1 if the method returns true.  Otherwise print an "invalid color"
	//   message.
        if ( item1.setColor('r') ) 
        {
            System.out.println(item1.color);
        }
        else 
        {
            System.out.println("Invalid color.");
        }

       // Test the class, using both valid and invalid colors.
               if ( item1.setColor(' ') ) 
        {
            System.out.println(item1.color);
        }
        else 
        {
            System.out.println("Invalid color.");
        }
        
    }
}
