package ch14;

public class Q_MethodOverriding {
}
/*
In Java, polymorphism states that when you override a method, you replace all calls to it,
even those defined in the parent class.
 */
class Penguin {
    public int getHeight() { return 3; }
    public void printInfo() {
        System.out.print(this.getHeight());
    }
}
class EmperorPenguin extends Penguin {
    @Override
    public int getHeight() { return 8; }
    public static void main(String []fish) {
        new EmperorPenguin().printInfo();
    }
}
////////////////////////////////////////////////////////////////
// What if we want it to print 3 instead of 8?
class EmperorPenguin2 extends Penguin {
    public int getHeight() { return 8; }
    // This printInfo() is new.
    public void printInfo() {
        System.out.print(super.getHeight());
    }
    public static void main(String []fish) {
        new EmperorPenguin().printInfo(); // 3
    }
}