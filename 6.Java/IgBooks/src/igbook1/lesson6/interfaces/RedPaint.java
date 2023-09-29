package igbook1.lesson6.interfaces;

public class RedPaint implements SalesCalcs {
    private String name = "Red Paint";
    private double salesPrice;
    private double cost;
    private double weight;

    public RedPaint(double salesPrice, double cost, double weight) {
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
