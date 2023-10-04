package igbook1.lesson5.enums;

public class Computer {
    PowerState state;

    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.state = PowerState.SUSPEND;

        switch (comp.state) {
            case OFF:
                ///.....
        }

        System.out.println("Current state: " + comp.state);
        System.out.println("Description: " + comp.state.getDescription());

    }

    final static void hello() {

    }
}
