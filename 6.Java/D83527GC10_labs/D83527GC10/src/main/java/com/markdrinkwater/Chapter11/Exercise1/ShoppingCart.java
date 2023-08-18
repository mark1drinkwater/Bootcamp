package com.markdrinkwater.Chapter11.Exercise1;

// import statements here:

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class ShoppingCart {
    public static void main(String[] args){
	// Declare a LocalDateTime object, orderDate
        LocalDate orderDate;
        
	// Initialize the orderDate to the current date and time. Print it.
        orderDate = LocalDate.now();
        System.out.println("Order date: " + orderDate);

	// Format orderDate using ISO_LOCAL_DATE; Print it.
        String fDate = orderDate.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Formatted order date: " + fDate);
    }
}