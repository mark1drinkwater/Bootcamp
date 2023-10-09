package OCP.Chapter6.subclasses.constructors;

public class Bunny {
    String name;
    public Bunny() {
        System.out.print("hop");
    }
    public Bunny(String name) {
        this.name = name;
    }
    public void Bunny() {
        System.out.println("Not a constructor.");
    }

    public static void main(String[] args) {
        Bunny b1 = new Bunny();
        Bunny b2 = new Bunny();
        Bunny b3 = new Bunny();
    }

}