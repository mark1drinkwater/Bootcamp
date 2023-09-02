package Book_5.Chapter_1.CountDownV3;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CountDownAppNew
{
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor pool = new ScheduledThreadPoolExecutor(25);
        Runnable flood, ignition, liftoff;

        flood = new LaunchEventNew("Flood the pad!");
        ignition = new LaunchEventNew("Start engines!");
        liftoff = new LaunchEventNew("Liftoff!");

        for (int t = 20; t >= 0; t--) {
            pool.schedule(new CountDownClockNew(t), (long) (20 - t), TimeUnit.SECONDS);
        }

        pool.schedule(flood, 4L, TimeUnit.SECONDS);
        pool.schedule(ignition, 14L, TimeUnit.SECONDS);
        pool.schedule(liftoff, 20L, TimeUnit.SECONDS);

        pool.shutdown();

    }
}
