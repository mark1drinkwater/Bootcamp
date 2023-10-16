package com.example.test;

import com.example.domain.Item;
import com.example.domain.ShoppingCart;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SerializeTest {

    public static void main(String[] args) {
        String directory = "C:\\Users\\Mark\\Documents\\Bootcamp\\6.Java\\D84838GC10_labs\\labs\\13-IO_Fundamentals\\practices\\practice2\\SerializeShoppingCart13-02Prac\\src\\com\\example\\test" ;
        String cartId = null;
        ShoppingCart cart = null;
        System.out.println("Enter the ID of the cart file to create and serialize or q exit.");
        // Wrap the System.in InputStream with a BufferedReader to read
        // each line from the keyboard.
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            cartId = in.readLine();
            if (cartId.equals("q")) {
                System.exit(0);
            }
//            cart = new ShoppingCart(new Integer(cartId).intValue());
            cart = new ShoppingCart(Integer.parseInt(cartId));
        } catch (IOException | NumberFormatException e) { // Catch any exceptions.
            System.out.println("Exception: " + e);
            System.exit(-1);
        }
        
        // Add some items
        cart.addItem(new Item(101, "Duke Plastic Circular Flying Disc", 10.95));
        cart.addItem(new Item(123, "Duke Soccer Pro Soccer ball", 29.95));
        cart.addItem(new Item(45, "Duke \"The Edge\" Tennis Balls - 12-Ball Bag", 17.49));

        // Print some messages about the cart
        System.out.println("Shopping cart " + cartId + " contains " + cart.getCartSize() + " items");
        System.out.println("Shopping cart total: "
                + NumberFormat.getCurrencyInstance().format(cart.getCartTotal()));

        String cartFile = directory + "\\cart" + cart.getCartID() + ".ser";
        // Your code goes here....
        
        try (FileOutputStream fs = new FileOutputStream(cartFile);
             ObjectOutputStream os = new ObjectOutputStream(fs);
                ) {
            os.writeObject(cart);
        } catch (FileNotFoundException ex) {
            System.out.println("Exception serialising " + cartFile + " " + ex);
            System.exit(-1);
        } catch (IOException ex) {
            System.out.println("IOException serialising " + cartFile + " " + ex);
        }
         
        System.out.println("Successfully serialized shopping cart with ID: " + cart.getCartID() );
            
    }
}