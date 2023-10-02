package igbook1.lesson5.generalization;

public abstract class ElectronicDevice {
    // Enabling Generalization
    /*
        Coding to a common base type allows for the introduction of new sub classes
        with little or no modification of any code that depends on the more generic base type.
        ElectronicDevice dev = new Television();
        dev.turnOn(); // all ElectronicDevices can be turned on
        Always use the most generic reference type possible.
        Must override all abstract methods inherited from parent class.
     */
    public abstract void turnOn();
    public abstract void turnOff();

    public void hello() {
        System.out.println("Hello");
    }

}
