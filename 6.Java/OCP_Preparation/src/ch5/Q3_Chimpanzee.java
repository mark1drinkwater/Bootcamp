package ch5;

public class Q3_Chimpanzee {
    public void climb(long t) {}
    public void swing(Integer u) {}
    public void jump(int v) {}
    public void eatBanna(Long v) {}

    public static void main(String[] args) {
        var c = new Q3_Chimpanzee();
        c.climb(123);
        c.swing(123);
//        c.jump(123L); // DOES NOT COMPILE
//        c.eatBanna(3);
    }

}