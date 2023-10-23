package pond.inland;

import pond.shore.Bird;

public class BirdWatcherFromAfar { // Not a subclass of Bird
    public void watchBird() {
        Bird bird = new Bird();
//        bird.floatInWater(); // DOES NOT COMPILE
//        System.out.print(bird.text); // DOES NOT COMPILE
//        Swan swan = new Swan();
    }
}