package com.example.lambda;

import java.util.List;
import java.util.OptionalDouble;

/**
 *
 * @author oracle
 */
public class CalcTest {
    
    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();
        
        // Print out Transaction Totals
        System.out.println("=== Transactions Totals ===");
        double t1 = 0; // Radio Hut code here
        t1 = tList.parallelStream()
                    .filter(t -> t.getBuyerName().equals("Radio Hut"))
                    .mapToDouble(SalesTxn::getTransactionTotal)
                    .sum();
        
        System.out.printf("Radio Hut Total: $%,9.2f%n", t1);
        
        double t2 = 0; //PriceCo Code Here
        t2 = tList.stream()
                .filter(t -> t.getBuyerName().equals("PriceCo"))
                .mapToDouble(SalesTxn::getTransactionTotal)
                .parallel()
                .sum();
        
        System.out.printf("PriceCo Total: $%,9.2f%n", t2);
        
        double t3 = 0; // Best Deals Code here
        t3 = tList.stream()
                .filter(t -> t.getBuyerName().equals("Best Deals"))
                .mapToDouble(SalesTxn::getTransactionTotal)
                .sequential()
                .sum();
        
        System.out.printf("Best Deals Total: $%,9.2f%n", t3);                 
        
    }
}
