package igbook1.lesson6.interfaces;

public class BetterCrushedRock implements SalesCalcs {
    private String name = "Crushed Rock";
    private double cost;
    private double weight ;
    private double salesPrice;

    public BetterCrushedRock(double salesPrice, double cost, double weight) {
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
        return this.salesPrice * this.weight;
    }

    @Override
    public double calcCost() {
        return this.cost * this.weight;
    }

    @Override
    public double calcProfit() {
        return this.calcSalesPrice() - this.calcCost();
    }
}
