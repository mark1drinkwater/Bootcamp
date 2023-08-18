
package com.markdrinkwater.Chapter11.Exercise2;

public class ShoppingCart {
    public static void main(String[] args) {
        String name;
        int age;

        // Parse the args array to populate name and age.  
	// Print an error message if fewer than 2 args are passed in.
        if (args.length < 2) {
            System.out.println("You must pass 2 arguments. Your name followed by your age.");
        }
        
        name = args[0];
        age = Integer.parseInt(args[1]);       
        
        System.out.println("Your name is " + name + " and age is " + age + ".");
        
    }
}
