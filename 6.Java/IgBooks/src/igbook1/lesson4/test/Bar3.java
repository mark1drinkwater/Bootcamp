package igbook1.lesson4.test;

import igbook1.lesson4.demo.Foo3;

public class Bar3 extends Foo3 {
    private int sum = 10;
    public void reportSum() {
        sum += getResult();
    }
}
