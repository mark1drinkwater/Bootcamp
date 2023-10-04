package igbook1.lesson4.workers;

public class GoodBonus {
    public static double getBonusPercent(Employee e) {
        if (e instanceof Manager) {
            return 0.03;
        } else if (e instanceof Employee) {
            return 0.02;
        } else {
            return 0.01;
        }
    }
}
