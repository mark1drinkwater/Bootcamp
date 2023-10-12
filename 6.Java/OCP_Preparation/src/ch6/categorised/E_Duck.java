package ch6.categorised;

public class E_Duck {
    private String color;
    private int height;
    private int length;

    public static void main(String[] args) {
        E_Duck b = new E_Duck();
        b.setData(1, 2);
        System.out.print(b.length + " " + b.height + " " + b.color);
    }

    public void setData(int length, int theHeight) {
        length = this.length; // Backwards -- no good!
        height = theHeight; // Fine, because a different name
        this.color = "white"; // Fine, but this. reference not necessary
    }
}