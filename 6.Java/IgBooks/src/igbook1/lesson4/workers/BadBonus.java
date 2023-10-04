package igbook1.lesson4.workers;

public class BadBonus extends Object {
    // Not very object-oriented!
    // What if you add two or three more employee types?
    // More duplicate code and methods
    public double getBonusPercent(Employee e) {
        return 0.01;
    }

    public double getBonusPercent(Manager m) {
        return 0.03;
    }
}
