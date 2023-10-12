package ch5;

public class F_EffectivelyFinal {
    public String zooFriends() {
        String name = "Harry the Hippo";
        var size = 10;
        final boolean wet;
        if (size > 100) size++;
        wet = true;
        return name;
    }
}

class PolarBear {
    final int age = 10;
    final int fishEaten;
    final String name;
    { fishEaten = 10; }
    public PolarBear() {
        name = "Robert";
    }
}