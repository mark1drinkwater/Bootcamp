package com.example.lambda;

import java.util.List;
import java.util.function.Function;

/**
 *
 * @author MikeW
 */
public class A03Function {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);
        
    // A Function takes one generic and returns another.
    // This function takes SalesTxn and returns a String.
    // t is the SalesTxn and getBuyerName() returns the string.
    Function<SalesTxn, String> buyerFunction = 
        t -> t.getBuyerName();
    
    System.out.println("\n== First Buyer");
    // In order to use the function, we call the apply method on it and pass the first element
    System.out.println(buyerFunction.apply(first));      
  }
}