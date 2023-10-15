package com.example.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

/**
 *
 * @author MikeW
 */
public class A05PrimFunction {
  
  public static void main(String[] args){ 
      
    // There are primitive versions of all the main interfaces.
    // Return a primitive e.g. ToDoubleFunction
    // This avoids autoboxing and unboxing which can negatively impact performance.

    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);
           
    ToDoubleFunction<SalesTxn> discountFunction = 
        t -> t.getTransactionTotal() 
            * t.getDiscountRate();
    
    System.out.println("\n== Discount");
    System.out.println(
          // This takes a Generic (SalesTxn) and returns a double.
        discountFunction.applyAsDouble(first));

    // A function takes one generic type (SalesTxn) and returns another (Double).
    Function<SalesTxn, Double> taxFunction = 
        t -> t.getTransactionTotal() * t.getTaxRate();
    
    // Here we actually use the Function we created.
    double tax = taxFunction.apply(first); // What happerns here?    
  }
}
