package com.example.lambda;

import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author MikeW
 */
public class A01Predicate {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    
    // A predicate takes a generic value and returns a boolean value.
    // Predicate for sales in Massachusetts
    Predicate<SalesTxn> massSales = 
        t -> t.getState().equals(State.MA);
    
    System.out.println("\n== Sales - Stream");
    // Use Massachusetts predicate to filter sales in that state.
    tList.stream()
        .filter(massSales)
        .forEach(t -> t.printSummary());
        
   
    // A predicate takes a generic value and returns a boolean value.
    System.out.println("\n== Sales - Method Call");    
    for(SalesTxn t:tList){       
        // This a clear example of a predicate -- It takes a generic value and returns a boolean value.
        // Returns true if the input value (the current sale) matches the massSales predicate.
        if (massSales.test(t)){
            t.printSummary();
        }
    }
  }
}