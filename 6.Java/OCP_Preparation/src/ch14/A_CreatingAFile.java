package ch14;

import java.io.File;

public class A_CreatingAFile {
    public static void main(String[] args) {
        // (Old file API)
        // The File class is created by calling its constructor.
        // All three create a File object that points ot the same location on disk.
        File zooFile1 = new File("C:/Users/Mark/Documents/Bootcamp/2.JavaScript/class/Chapter 5/chapter5.js");
        File zooFile2 = new File("C:/Users/Mark/Documents/Bootcamp/2.JavaScript/class", "Chapter 5/chapter5.js");

        File parent = new File("C:/Users/Mark/Documents/Bootcamp/2.JavaScript/class");
        File zooFile3 = new File(parent, "Chapter 5/chapter5.js");

        System.out.println("Does " + zooFile1 + " exist? " + zooFile1.exists());
        System.out.println("Does " + zooFile2 + " exist? " + zooFile2.exists());
        System.out.println("Does " + zooFile3 + " exist? " + zooFile3.exists());
    }
}
