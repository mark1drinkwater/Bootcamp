package ch1;

import java.util.Random;
import java.util.*; // imports Java.util.Random among other things

// Wildcards:
// Does not actually everything, only imports the classes directly under the package.
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.concurrent.atomic.*;

public class F_PackageDeclarationsImports {
}

class NumberPicker {
    public static void main(String[] args) {
        // We need the import for it to work
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}