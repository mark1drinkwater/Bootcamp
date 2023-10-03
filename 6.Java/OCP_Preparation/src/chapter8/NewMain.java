/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter8;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author Mark
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        // More roundabout way
        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");
        // Shorter way using convience methods.
        brownEggs = egg.and(brown);
        otherEggs = egg.and(brown.negate());

        System.out.println(brownEggs.test("brown eggs"));
        System.out.println(otherEggs.test("scrambled eggs"));
        

        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 = x -> System.out.print(",2: " + x);

        Consumer<String> combined = c1.andThen(c2);
        combined.accept("cat");
    
    }
}
