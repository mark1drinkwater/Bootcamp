package ch5;

public class R_OverloadingMethods {
}

class Falcon {
    public void fly(int numMiles) {}
    public void fly(short numFeet) {}
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) {}
    public void fly(short numFeet, int numMiles) throws Exception {}
}

class Eagle {
    public void fly(int numMiles) {
    }
//    public int fly(int numMiles) { return 1; } // DOES NOT COMPILE
}

class Hawk {
    public void fly(int numMiles) {}
//    public static void fly(int numMiles) {} // DOES NOT COMPILE
//    public void fly(int numKilometers) {} // DOES NOT COMPILE
}

class Dove {
    public void fly(int numMiles) {
        System.out.println("int");
    }

    public void fly(short numFeet) {
        System.out.println("short");
    }
}