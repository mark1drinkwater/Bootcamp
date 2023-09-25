/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter1;

import static chapter1.WaterBottle.code;

/**
 *
 * @author Mark
 */

    /**
     * @param args the command line arguments
     */
    public class WaterBottle {

        private String brand;
        private boolean empty;
        
        public static float code;


    }

class WaterBottleTest {
        public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();

        System.out.println("Empty = " + wb.empty);
        System.out.println("Brand = " + wb.brand);
        System.out.println("Code = " + code);
    }
}