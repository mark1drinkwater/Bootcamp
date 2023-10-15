package ch14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class B_CreatingAPath {
    public static void main(String[] args) {
        // Since, a Path is an interface, we can't create an instance directly.
        // The easiest way to get a Path object is to use the static factory method.
        Path zooPath1 = Path.of("C:/Users/Mark/Documents/Bootcamp/2.JavaScript/class/Chapter 5/chapter5.js");
        // Varargs
        Path zooPath2 = Path.of("C:/Users/Mark/Documents","Bootcamp", "2.JavaScript", "class/Chapter 5", "chapter5.js");

        // This may be deprecated in future releases.
        // The above method is the recommended way.
        // Though they both do the same thing.
        Path zooPath3 = Paths.get("C:/Users/Mark/Documents/Bootcamp/2.JavaScript/class/Chapter 5/chapter5.js");
        Path zooPath4 = Paths.get("C:/Users/Mark/Documents","Bootcamp", "2.JavaScript", "class/Chapter 5", "chapter5.js");

        System.out.println("Does " + zooPath1 + " exist? " + Files.exists(zooPath1));
        System.out.println("Does " + zooPath2 + " exist? " + Files.exists(zooPath2));
        System.out.println("Does " + zooPath3 + " exist? " + Files.exists(zooPath3));
        System.out.println("Does " + zooPath4 + " exist? " + Files.exists(zooPath4));
    }
}
