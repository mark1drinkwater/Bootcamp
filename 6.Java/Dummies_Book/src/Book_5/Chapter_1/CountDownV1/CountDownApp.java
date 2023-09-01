package Book_5.Chapter_1.CountDownV1;

public class CountDownApp
{
    public static void main(String[] args) {
        Thread clock = new CountDownClock();
        Runnable flood, ignition, liftoff;

        flood = new LaunchEvent(16, "Flood the pad!");
        ignition = new LaunchEvent(5, "Start the engines!");
        liftoff = new LaunchEvent(0, "Liftoff!");
        clock.start();

        new Thread(flood).start();
        new Thread(ignition).start();
        new Thread(liftoff).start();
    }
}
