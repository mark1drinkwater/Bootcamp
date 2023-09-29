package igbook1.lesson6.interfaces;

public interface WidgetSalesCalcs extends SalesCalcs {
    public String getWidgetType();
    // Intefaces can extend interfaces.
    // So now any class implementing WidgetSalesCalcs must
    // implement all the methods of SalesCalcs in addition to the new method here.
}
