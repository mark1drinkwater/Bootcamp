package com.example.lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author MikeW
 */
public class A04Supplier {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    // The supllier returns a generic type and takes no parameters.
    Supplier<SalesTxn> txnSupplier = 
        () -> new SalesTxn.Builder()
            .txnId(101)
            .salesPerson("John Adams")
            .buyer(Buyer.getBuyerMap().get("PriceCo"))
            .product("Widget")
            .paymentType("Cash")
            .unitPrice(20)
            .unitCount(8000)
            .txnDate(LocalDate.of(2013,11,10))
            .city("Boston")
            .state(State.MA)
            .code("02108")
            .build();
    
    // The get method returns the SalesTxn type (Generic) but takes no parameters.
    tList.add(txnSupplier.get());
    System.out.println("\n== TList");
    tList.stream().forEach(SalesTxn::printSummary);
  }
}