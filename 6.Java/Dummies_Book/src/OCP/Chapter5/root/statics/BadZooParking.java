package OCP.Chapter5.root.statics;

//import static java.util.Arrays; // DOES NOT COMPILE
import static java.util.Arrays.asList;

//static import java.util.Arrays.*; // DOES NOT COMPILE. Should be 1st import then static

public class BadZooParking {
    public static void main(String[] args) {
//        Arrays.asList("one"); // DOES NOT COMPILE
    }
}