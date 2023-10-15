package com.example.lambda;

import java.util.List;
import java.util.function.UnaryOperator;

/**
 *
 * @author MikeW
 */
public class A08Unary {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);
        
    // A unary operator takes in a class and returns an object of that same class.
    // It is like a function in that it takes 1 Generic as a parameter and returns another generic.
    // BUT it takes and returns the SAME type
    // E.g. it takes in a string and it will return the same type.
    UnaryOperator<String> unaryStr = 
        s -> s.toUpperCase();
    
      System.out.println("== Upper Buyer");
      System.out.println(
          unaryStr.apply(first.getBuyerName()));
  }
}
