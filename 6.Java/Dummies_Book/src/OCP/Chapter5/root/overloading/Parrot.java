package OCP.Chapter5.root.overloading;

import java.time.*;
import java.util.*;
public class Parrot {
    public static void print(List<Integer> i) {
        System.out.print("I");
    }
    public static void print(CharSequence c) {
        System.out.print("C");
    }
    public static void print(Object o) {
        System.out.print("O");
    }
    public static void main(String[] args){
        print("abc"); // A string implements the CharSequence interface
        print(Arrays.asList(3)); // This returns a List<T>
        print(LocalDate.of(2019, Month.JULY, 4)); // This returns a LocalDate, but there is no such method, so it casts it to an Object.
    }
}