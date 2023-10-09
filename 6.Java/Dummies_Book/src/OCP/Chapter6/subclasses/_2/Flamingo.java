package OCP.Chapter6.subclasses._2;

public class Flamingo {
    private String color = null;
    public void setColor(String color) {
//        color = color;
        // Fix:
        this.color = color;
    }

    public static void main(String... unused) {
        var f = new Flamingo();
        f.setColor("PINK");
        System.out.print(f.color);
    }
}
