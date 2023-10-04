package igbook1.lesson4.test;

import igbook1.lesson4.demo.Foo;

public class Bar extends Foo {
    private int sum = 10;
    public void reportSum() {
        sum += result;
//        sum += num; //compiler error
        // default access is only to classes & sub-classes within same package
    }

    public static void main(String[] args) {
        Bar b = new Bar();
        b.reportSum();
    }
}
