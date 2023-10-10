package root;

public class PolarBear {
    final int age = 10;
    final int fishEaten;
    final String name;
    { fishEaten = 10; }
    public PolarBear() {
        name = "Robert";
    }

    public static void main(String[] args) {
        PolarBear pb = new PolarBear();
        System.out.println("Age: %d fishEaten: %d Name: %s".formatted(pb.age, pb.fishEaten, pb.name));
    }
}
