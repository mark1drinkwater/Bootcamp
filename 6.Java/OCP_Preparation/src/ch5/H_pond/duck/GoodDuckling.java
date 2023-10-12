package ch5.H_pond.duck;

public class GoodDuckling {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        System.out.println("Good Duckling");
        duck.quack();
        System.out.println(duck.noise);
    }
}
