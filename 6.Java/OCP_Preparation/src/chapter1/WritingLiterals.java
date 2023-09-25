/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter1;

/**
 *
 * @author Mark
 */
public class WritingLiterals {

    public static void main(String[] args) {
        long max = 3123456789L;

        // Does not Compile. 
        // May not use a _ at the beginning, end of a literal.
        // Or Before or After a literal.
//        double notAtStart = _1000.00; // DOES NOT COMPILE
//        double notAtEnd = 1000.00_; // DOES NOT COMPILE
//        double notByDecimal = 1000_.00; // DOES NOT COMPILE
        double annoyingButLegal = 1_00_0.0_0; // Ugly, but compiles
        double reallyUgly = 1__________2; // Also compiles      

        // Can't assign null to a primitive type. Won't comile
//        int value = null;
        String s = "Hello";
        System.out.println("Hello string length: " + s.length());

        Integer len = s.length();
        // But reference Integers can be assigned null
        len = null;

        // Integer Primitive vs Wrapper Conversion
        // Parse converts it to a primitve
        // valueOf converts it to a (object) Integer : wrapper.
        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");

        System.out.println("Primitive: " + primitive);
        System.out.println("Wrapper: " + wrapper);

        // The wrapper class has access to methods. Primitives do not.
        // For instance:
        System.out.println(wrapper.equals(123));

        /////////////////////////////////////////////////////////
        // Double
        Double apple = Double.valueOf("200.99");
        System.out.println(apple.byteValue()); // -56
        System.out.println(apple.intValue()); // 200
        System.out.println(apple.doubleValue()); // 200.99
    }

}
