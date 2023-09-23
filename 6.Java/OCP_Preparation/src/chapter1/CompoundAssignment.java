/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter1;

/**
 *
 * @author Mark
 */
public class CompoundAssignment {
        static String a = null;
        static String b = null;
        
    public static void main(String[] args) {
        int camel = 2, giraffe = 3;
        camel = camel * giraffe; // Simple assignment operator
        System.out.println(camel);
        camel *= giraffe; // Compound assignment operator
        
        System.out.println(camel);
        
       
        // DOES not compile
        long goat = 10;
        int sheep = 5;
        //sheep = sheep * goat; // DOES NOT COMPILE -- We can't store a long inside a int
        sheep = (int)(sheep * goat);
           // Step 1: Casts sheep to a long
           // Step 2: Multiplication
           // Step 3: Cast the long to an int
        sheep *= goat;
        
        int hugeNumber = Integer.MAX_VALUE;
        long imOne = 1L;
        hugeNumber += imOne;
        System.out.println("Will hugeNumber overflow? " + hugeNumber);
        
        // Result value of assignment operators:
        long wolf = 5;
        // The assignment operators does return a value
        long coyote = (wolf=3);
        System.out.println(wolf); // 3
        System.out.println(coyote); // 3
        
        boolean healthy = false;
        if(healthy = true)
            System.out.print("Good!");
        

        
        System.out.println(a == b);
    }
    
}
