package igbook1.lesson4.demo;

public class Foo3 {
    private int result = 20;
    // If you want to limit access of the field
    protected int getResult() {
        return this.result;
    }
}
