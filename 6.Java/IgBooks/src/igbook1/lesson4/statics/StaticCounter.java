package igbook1.lesson4.statics;

public class StaticCounter {
    private static int counter = 0;

    public static int getCount() {
        return counter;
    }

    public static void increment() {
        counter++;
    }

    public static void main(String[] args) {
        System.out.println("Start: " + StaticCounter.getCount());
        StaticCounter.increment();
        StaticCounter.increment();
        System.out.println("End: " + StaticCounter.getCount());

        // Avoid using object references to access static variables e.g.
        StaticCounter sc = new StaticCounter();
        sc.increment(); // avoid

        sc.getCount();
    }

}
