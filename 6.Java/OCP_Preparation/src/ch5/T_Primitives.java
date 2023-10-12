package ch5;

public class T_Primitives {
}

class Ostrich {
    public static void main(String[] args) {
        var p = new Ostrich();
        p.fly(123);
        System.out.print("-");
        p.fly(123L);
    }

    public void fly(int i) {
        System.out.print("int");
    }

    public void fly(long l) {
        System.out.print("long");
    }
}