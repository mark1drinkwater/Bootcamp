package OCP.Chapter11.exceptions;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class N_ConstructingTryResources {
    public static void main(String[] args) {
        // Does Not implement AutoCloseable interface so can't be used
//        try (String reptile = "lizard") {}
    }
}

//////////////////////////////////
// This is the base class we'll be using this section.
class MyFileClass implements AutoCloseable {
    private final int num;
    public MyFileClass(int num) {
        this.num = num;
    }

    @Override
    public void close() {
        System.out.println("Closing: " + num);
    }
}

/////////////////////////////////////////////////////////
class TryResources {
    public static void main(String[] args) {
        try (var myFile = new MyFileClass(3)) {
            System.out.println("My file opened.");
        }
    }
}


class DeclaringResources {
    public static void main(String[] args) {
        // Why does this Not compile?
//        try (MyFileClass is = new MyFileClass(1),
//        var os = new MyFileClass(2) ) {
//        }

        // Why does this Not Compile?
//        try (MyFileClass ab = new MyFileClass(1),
//            MyFileClass cd = new MyFileClass(2)) {
//
//        }

        // You can use var as a data type, since resources are local variables.
        try (var f = new BufferedInputStream(new FileInputStream("it.txt"))) {

        } catch (IOException e) {
            System.out.println("IO Exception occurred");
        }
//////////////////////////////////////////////////////////
// Scoping
        // The resources created in the try clause are only in scope in the try block.
        Scanner s2 = null;
        try (Scanner s = new Scanner(System.in)) {
            s2 = s;
            s.nextLine();
        } catch (Exception e) {
             s2.nextInt();
        } finally {
            // The scanner closes before the finally block is called
            // That's why we got a IllegalStateException
             s2.nextInt();
        }
    }
}

////////////////////////////////////////////////////////
// Following Order of Operations
class OrderOperations {
    public static void main(String... xyz) {
        // The resources are closed in the reverse order they were created.
        try (MyFileClass bookReader = new MyFileClass(1);
              MyFileClass movieReader = new MyFileClass(2)) {
            System.out.println("Try Block");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("Catch Block");
        } finally {
            System.out.println("Finally Block");
        }
    }
}

/////////////////////////////////////////////////////
// Effectively Final
// While resources are often created in try-with-resources statement,
// it is possible to declare them ahead of time, provided they're marked final or effectively final.

class EffectivelyFinal {
    public static void main(String... xyz) {
        final var bookReader = new MyFileClass(4);
        MyFileClass movieReader = new MyFileClass(5); // effectively final

        try (bookReader;
               var tvReader = new MyFileClass(6);
               movieReader) {
            System.out.println("Try Block");
        } finally {
            System.out.println("Finally Block");
        }

        // Does Not Compile
//        var writer = Files.newBufferedWriter(Paths.get("C:\\"));
//        try (writer) {
//            writer.append("Welcome to the zoo!")
//        }
//        writer = null;
    }
}















