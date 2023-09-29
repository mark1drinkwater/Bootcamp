package igbook1.lesson6.interfaces;
// A class can both extend a class and implement interface(s).
// But extends must come first before implements.
public class WidgetPro extends Widget implements WidgetSalesCalcs {
    private String type;
    public WidgetPro(double salesPrice, double cost, double weight) {
        super(salesPrice, cost, weight);
        this.type = type;
    }

    @Override
    public void printItemReport() {
        super.printItemReport();
    }

    @Override
    public String getWidgetType() {
        return type;
    }
}
