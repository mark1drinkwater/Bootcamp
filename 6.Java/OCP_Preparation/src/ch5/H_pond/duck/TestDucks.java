package ch5.H_pond.duck;

import ch5.H2_.Snake;
import ch5.H_pond.goose.Gosling;
import ch5.H_pond.goose.LostDuckling;
import ch5.H_pond.shore.BirdWatcher;

public class TestDucks {
    public static void main(String[] args) {
        GoodDuckling duck = new GoodDuckling();
        duck.makeNoise();

        BadDuckling duck2 = new BadDuckling();
        duck2.makeNoise();

        System.out.println("Gosling.");
        Gosling bird = new Gosling();
        bird.swim();

        System.out.println("Bird Watcher:");
        BirdWatcher bw = new BirdWatcher();
        bw.watchBird();

        System.out.println("Lost duckling learning to swim.");
        LostDuckling lostDuck = new LostDuckling();
        lostDuck.swim();

        System.out.println("Snake:");
        System.out.println(Snake.hiss);
        Snake.makeSnakeNoise();

        Snake s = new Snake();
        s = null;
        s.makeSnakeNoise();
    }
}
