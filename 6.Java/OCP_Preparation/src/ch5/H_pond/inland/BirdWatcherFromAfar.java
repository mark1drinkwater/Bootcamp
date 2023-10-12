package ch5.H_pond.inland;


import ch5.H_pond.shore.Bird;
import ch5.H_pond.swan.Swan;

public class BirdWatcherFromAfar { // Not a subclass of Bird
    public void watchBird() {
        Bird bird = new Bird();
//        bird.floatInWater(); // DOES NOT COMPILE
//        System.out.print(bird.text); // DOES NOT COMPILE
        Swan swan = new Swan();
    }
}