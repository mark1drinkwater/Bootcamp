package ch5;

import java.util.List;
import java.util.Arrays;
//////////////////////////////////////////////////
import java.util.List;

import static java.util.Arrays.asList; // static import

/////////////////////////////////////////////////
//import static java.util.Arrays; // DOES NOT COMPILE
import static java.util.Arrays.asList;
//static import java.util.Arrays.*; // DOES NOT COMPILE

/////////////////////////////////////////////////////////////

//import static zoo.A.TYPE;
//import static zoo.B.TYPE; // DOES NOT COMPILE
///////////////////////////////////////////////////

public class N_StaticImports {
}


class Imports {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two");
    }
}

///////////////////////////////////////////////////
// Static Imports
class ZooParking {
    public static void main(String[] args) {
        List<String> list = asList("one", "two"); // No Arrays. prefix
    }
}

class BadZooParking {
    public static void main(String[] args) {
        Arrays.asList("one"); // DOES NOT COMPILE
    }
}