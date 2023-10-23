package pond.duck;

import pond.goose.Gosling;
import pond.goose.LostDuckling;
import pond.shore.BirdWatcher;
import root.Snake;

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
