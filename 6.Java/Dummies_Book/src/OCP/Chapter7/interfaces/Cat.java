package OCP.Chapter7.interfaces;

interface Walk {
    public default int getSpeed() {
        return 5;
    }
}

interface Run {
    public default int getSpeed() {
        return 10;
    }
}

//  public class Cat implements Walk, Run {} // DOES NOT COMPILE

public class Cat implements Walk, Run {
    @Override
    public int getSpeed() {
        return 1;
    }
}

class Cat2 implements Walk, Run {
    public int getSpeed() {
        return 1;
    }

    public int getWalkSpeed() {
        return Walk.super.getSpeed();
    }
}