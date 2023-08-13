
package com.markdrinkwater.Chapter08.Exercise2;


public class ShoppingCart {
    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the 3-arg setItemFields method and then call displayItem.
        item1.setItemDisplay("Chips", 3, 9.99);
        item1.displayItem();

        // Call the 4-arg setItemFields method, checking the return value.  
        int returnValue = item1.setItemDisplay("Flowers", 3, 20.99, ' ');

	// Test your code for both valid and invalid values
        if (returnValue < 0 ) {
            System.out.println("Invalid color code");
        } else {
            item1.displayItem();
        }
        
        //
        returnValue = item1.setItemDisplay("Flowers", 3, 20.99, 'R');
               if (returnValue < 0 ) {
            System.out.println("Invalid color code");
        } else {
            item1.displayItem();
        }
        
    }
}
