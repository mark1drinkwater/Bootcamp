package igbook1.lesson6.interfaces;

public interface SalesCalcs {
    public String getName();
    public double calcSalesPrice();
    public double calcCost();
    public double calcProfit();

    /*
        Rules for Interfaces:
          Access Modifiers: All methods are public even if you forget to declare them public.
          You may not declare methods as private or protected in an interface.

          Abstract Modifier: All methods are implicitly abstract, so it's redundant do declare them as abstract.

          Implement Multiple Interfaces: A class can implement more than one interface in a comma-separated list at the
          end of the class declaration.
     */

    /*
        Java 8 added default methods as a new feature.
        Using default allows you to provide fully implemented methods to all implementing classes.
        This feature was added to simplify the development of APIs that rely heavily on interfaces.
        Before, simply adding a new method breaks all implementing and extended classes.
        Now, default methods can be added or changed without harming API hierarchies.
     */
    public default void printItemReport() {
        System.out.println("--" + this.getName() + " Report--");
        System.out.println("Sales Price: " + this.calcSalesPrice());
        System.out.println("Cost: " + this.calcCost());
        System.out.println("Profit: " + this.calcProfit());
    }

    /*
        Java 8 allows static methods in an interface. So now we can create helper methods.
     */
    public static void printItemArray(SalesCalcs[] items) {
        System.out.println("=====The Sales Report=====");
        for (SalesCalcs item:items ) {
            System.out.println("--" + item.getName() + " Report--");
            System.out.println("Sales Price: " + item.calcSalesPrice());
            System.out.println("Cost: " + item.calcCost());
            System.out.println("Profit: " + item.calcProfit());
        }
    }

    // Interfaces can have constant fields.
    public static final String reportTitle="\n==Static List Report==";
    // ONLY constant fields are permitted in an interface.
    // When you declare a field in an interface, it is implicitly public, static and final.
}
