package OCP.Chapter5.root.boxingunbxing;

public class Chimpanzee {
    public void climb(long t) {}
    public void swing(Integer u) {}
    public void jump(int v) {}
    public static void main(String[] args) {
        var c = new Chimpanzee();
        c.climb(123);
        c.swing(123);
//        c.jump(123L); // DOES NOT COMPILE
    }
}