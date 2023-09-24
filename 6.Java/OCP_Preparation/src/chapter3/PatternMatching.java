/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter3;

/**
 *
 * @author Mark
 */
public class PatternMatching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Integer myNum = Integer.valueOf(5);
//        Byte myByte = Byte.valueOf("5");
//        compareIntegers(myNum);
//        compareIntegers(myByte);
        printIntegerTwice(5);
        printIntegerTwice(5.0);
    }

    // Java 16 officially introduced pattern matching with if statements and the instanceof operator.
    static void compareIntegers(Number number) {
        if (number instanceof Integer) {
            Integer data = (Integer) number;
            System.out.println(data.compareTo(5));
        }
    }

    //Pattern matching is a new tool at your disposal to reduce boilerplate in your code. 
    static void compareIntegers2(Number number) {
        if (number instanceof final Integer data) {
            System.out.println(data.compareTo(5));
        }
    }

    // Pattern matching includes expressions that can be used to filter data out, such as in the following example:
    void printIntegersGreaterThan5(Number number) {
        if (number instanceof Integer data && data.compareTo(5) > 0) {
            System.out.print(data);
        }
    }

    /* We can apply a number of filters, or patterns, so that the if statement is executed only in 
    specific circumstances. Notice that we’re using the pattern variable in an expression in the 
    same line in which it is declared. */
    //
    void printIntegersOrNumbersGreaterThan5(Number number) {
        if (number instanceof Integer data || data.compareTo(5) > 0) {
            System.out.print(data);
        }
    }

    static void printIntegerTwice(Number number) {
        if (number instanceof Integer data) {
            System.out.println(number + " is an integer.");
        } else {
            System.out.println(number + " is not an integer.");
        }
        // System.out.print(data.intValue()); // DOES NOT COMPILE
    }

}
