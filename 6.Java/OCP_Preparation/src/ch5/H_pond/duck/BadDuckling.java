package ch5.H_pond.duck;

public class BadDuckling {
    public void makeNoise() {
        var duck = new FatherDuck();
        System.out.println("Bad Duckling");
//        duck.quack(); // DOES NOT COMPILE
        //System.out.print(duck.noise); // DOES NOT COMPILE
    }
}