package ch13;

import java.util.concurrent.Executors;

public class O_Deadlock {
}

class Food {}
class Water {}
record Fox(String name) {
    public void eatAndDrink(Food food, Water water) {
        synchronized(food) {
            System.out.println(name() + " Got Food!");
            move();
            synchronized(water) {
                System.out.println(name() + " Got Water!");
            } } }
    public void drinkAndEat(Food food, Water water) {
        synchronized(water) {
            System.out.println(name() + " Got Water!");
            move();
            synchronized(food) {
                System.out.println(name() + " Got Food!");
            } } }
    public void move() {
        try { Thread.sleep(100); } catch (InterruptedException e) {}
    }

    public static void main(String[] args) {
        // Create participants and resources
        var foxy = new Fox("Foxy");
        var tails = new Fox("Tails");
        var sly = new Fox("sly");
        var food = new Food();
        var water = new Water();
        // Process data
        var service = Executors.newScheduledThreadPool(10);
        try {
            // Foxy & Tails are in a Deadlock
            service.submit(() -> foxy.eatAndDrink(food,water));
            service.submit(() -> tails.drinkAndEat(food,water));
            // Sly is an example of Starvation:::
            /*
                Starvation is when a single thread is perpetually denied access to a shared resource or lock.
                The thread is still active, but is unable to complete its work as a result of other threads constantly
                taking the source that it is trying to access.
                E.g. Foxy & Tails both have the food and water.
                Sly can access neither.
             */
            service.submit(() -> sly.drinkAndEat(food,water));
        } finally {
            service.shutdown();
        }
    }
}