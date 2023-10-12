package ch6.categorised;

public class D_Flamingo {
    private String color = null;
    public void setColor(String color) {
//        color = color;
        // Fix:
        this.color = color;
    }

    public static void main(String... unused) {
        var f = new D_Flamingo();
        f.setColor("PINK");
        System.out.print(f.color);
    }
}
