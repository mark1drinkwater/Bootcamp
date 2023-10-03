package igbook1.lesson5.enums;

public enum PowerState {
    OFF("The power is off!"),
    ON("The usage power is high"),
    SUSPEND("The power usage is low");

    private String description;
    // The constructor may not be public or protected.
    private PowerState(String d) {
        description = d;
    }

    public String getDescription() {
        return description;
    }

}
