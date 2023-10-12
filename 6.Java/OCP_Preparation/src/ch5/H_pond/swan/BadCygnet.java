package ch5.H_pond.swan;

import ch5.H_pond.duck.MotherDuck;

public class BadCygnet {
    public void makeNoise() {
        var duck = new MotherDuck();
//        duck.quack(); // DOES NOT COMPILE
//        System.out.print(duck.noise); // DOES NOT COMPILE
    }
}