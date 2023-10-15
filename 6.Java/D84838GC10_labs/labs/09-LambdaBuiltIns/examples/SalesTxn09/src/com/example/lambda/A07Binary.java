package com.example.lambda;

import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author MikeW
 */
public class A07Binary {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);            
    String testState = "CA";
    
    // The binary predicate. Takes 2 generics and returns a boolean.
    // This example takes in a SalesTxn (t) and a String (s) and returns a boolean.
    // We're looking for states that match the state we pass in.
    BiPredicate<SalesTxn,String> stateBiPred = 
      (t, s) -> t.getState().getStr().equals(s);
    
    System.out.println("\n== First is CA?");
    System.out.println(
      stateBiPred.test(first, testState));
  }
}
