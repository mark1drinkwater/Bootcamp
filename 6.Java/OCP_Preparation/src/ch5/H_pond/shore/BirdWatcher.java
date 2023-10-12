package ch5.H_pond.shore; // Same package as Bird

public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // protected access is ok
        System.out.println(bird.text);
    }
}