package ch6.categorised;

public class F_SuperReference {
}

class Reptile {
    protected int speed = 10;
}

// Crocodile.java
class Crocodile extends Reptile {
    protected int speed = 20;

    public static void main(String[] data) {
        var croc = new Crocodile();
        System.out.println(croc.getSpeed()); // 20
    }

    public int getSpeed() {
//        return super.speed; // Causes the program to now print 10
        return speed;
    }
}