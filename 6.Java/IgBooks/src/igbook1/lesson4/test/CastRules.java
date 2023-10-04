package igbook1.lesson4.test;

import igbook1.lesson4.workers.Manager;

public class CastRules {
    public static void main(String[] args) {
        // Upward casts are always permitted and do not require a cast operator.
//        Director d = new Director();
//        Manager m = new Manager();

        // For downward casts, the compiler must be satisifed that the cast is possible.
        // With a downward cast, the compiler simply determines if the cast is possible.
        // If cast down to a subclass, then it is possible that the cast will succeed.

        // Manager m = (Manager)e;
        // Engineer eng = (Manager)e; // compile error
        // System.out.println(m.getDetails());
    }
}
