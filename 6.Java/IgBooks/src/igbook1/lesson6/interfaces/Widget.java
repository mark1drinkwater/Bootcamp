package igbook1.lesson6.interfaces;

public class Widget implements SalesCalcs {
    String name = "Widget";
    double salesPrice;
    double cost;
    double weight;
    public Widget(double salesPrice, double cost, double weight) {
        this.salesPrice = salesPrice;
        this.cost = cost;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calcSalesPrice() {
        return 0;
    }

    @Override
    public double calcCost() {
        return 0;
    }

    @Override
    public double calcProfit() {
        return 0;
    }
}
