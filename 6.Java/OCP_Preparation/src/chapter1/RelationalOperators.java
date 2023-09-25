/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter1;

/**
 *
 * @author Mark
 */
public class RelationalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int gibbonNumFeet = 2, wolfNumFeet = 4, ostrichNumFeet = 2;
        System.out.println(gibbonNumFeet < wolfNumFeet); // true
        System.out.println(gibbonNumFeet <= wolfNumFeet); // true
        System.out.println(gibbonNumFeet >= ostrichNumFeet); // true
        System.out.println(gibbonNumFeet > ostrichNumFeet); // false

        // instance of
        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;

        // Number Class is inherited by:
        // Short,Byte,Integer
        Byte shorty = 5;

        System.out.println(null instanceof Object); // false
        Object noObjectHere = null;
        System.out.println(noObjectHere instanceof String); // false
//        System.out.println(null instanceof null);
    }

//    public static void openZoo(Number time) {
//        if (time instanceof Integer) {
//            System.out.println("Is an integer.");
//            System.out.print((Integer) time + " O'clock");
//        } else if (time instanceof Short) {
//            System.out.println("It's a short.");
//        } else if (time instanceof Byte) {
//            System.out.println("It's a byte");
//        }
//    }

//    public static void openZoo(Number time) {
//        if (time instanceof String) // DOES NOT COMPILE
//        {
//            System.out.print(time);
//        }
//    }

}
