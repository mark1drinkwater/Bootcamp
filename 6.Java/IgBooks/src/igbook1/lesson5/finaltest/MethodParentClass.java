package igbook1.lesson5.finaltest;

public class MethodParentClass {
    public final void printMessage() {
        System.out.println("This is a final method");
    }

    public static void main(String[] args) {
        MethodParentClass p = new MethodParentClass();
        p.printMessage();
    }

}