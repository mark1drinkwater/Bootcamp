package ch14.AdvancedAPIs;

import java.io.*;

public class A_MarkingData {
    public static void readData(InputStream is) throws IOException {
        System.out.print((char) is.read()); // L
        if (is.markSupported()) {
            is.mark(    100); // Marks up to 100 bytes
            System.out.print((char) is.read()); // I
            System.out.print((char) is.read()); // O
            is.reset(); // Resets stream to position before I
        }
        System.out.print((char) is.read()); // I
        System.out.print((char) is.read()); // O
        System.out.print((char) is.read()); // N
    }

    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/data/lion.txt"));
        readData(bis);

//        System.out.println("\nEnter something:");
//        readData(System.in);
    }
}

class SkippingData {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter a value:");
        InputStream is = System.in; // Type TIGERS

        System.out.print ((char)is.read()); // T
        is.skip(2); // Skips I and G
        is.read(); // Reads E but doesn't output it
        System.out.print((char)is.read()); // R
        System.out.print((char)is.read()); // S

        System.out.println("\nHow many were skipped?\n"+is.skip(1000));
    }
}