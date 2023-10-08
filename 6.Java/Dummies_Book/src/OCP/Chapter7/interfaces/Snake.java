package OCP.Chapter7.interfaces;

public class Snake implements IsColdBlooded {
    @Override
    public boolean hasScales() {
        return true;
    }
    @Override
    public double getTemperature() {
        return 12;
    }

    public static void main(String[] args) {
        Snake s = new Snake();
        System.out.println("Snake temperature: " + s.getTemperature());
    }
}

interface IsColdBlooded {
    boolean hasScales();
    default double getTemperature() {
        return 10.0;
    }
}