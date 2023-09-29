package igbook1.lesson6.interfaces;

public class TestCrushedRocks {
    public static void main(String[] args) {
        BetterCrushedRock rock1 = new BetterCrushedRock(12,  10, 50);
        // We can store the BetterCrushedRock reference in the SalesCalcs interface because it implements that reference.
        SalesCalcs rock2 = new BetterCrushedRock(12, 10, 50);

        System.out.println("Sales Price: " + rock1.calcSalesPrice());
        System.out.println("Sales Price: " + rock2.calcSalesPrice());

        /*
            Any class implementing an interface can be referenced by that interface
         */
        SalesCalcs[] itemList = new SalesCalcs[5];
        ItemReport report = new ItemReport();

        itemList[0] = new BetterCrushedRock(12.0, 10.0, 50.0);
        itemList[1] = new BetterCrushedRock(8.0, 6.0, 10.0);
        itemList[2] = new RedPaint(10.0, 8.0, 25.0);
        itemList[3] = new Widget(6.0, 5.0, 10);
        itemList[4] = new Widget(14.0, 12.0, 20);

        System.out.println("==Sales Report==");
        for (SalesCalcs item : itemList) {
            report.printItemData(item);
        }

        // Instead of using the above method of having to use a separate class to print
        // Why not instead use the static method inside the interface
        SalesCalcs.printItemArray(itemList);
    }
}
