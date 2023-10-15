package com.example.lambda;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A07CalcSum {
  public static void main(String[] args) {
    List<Employee> eList = Employee.createShortList();
        
    System.out.println("\n== Total CO Bonus ==");
    double result;
    
    // The sum method calculates a sum based on the stream passed to it.
    // Notice the mapToDouble method is called before the stream is passed to sum.
    // If you look at the Stream class, no sum method is included.
    // Instead, a sum method is included in the primitive version of the Stream class
    // Namely, IntStream, DoubleStream, LongStream
    
    // So to get the sum method we first need to map the stream to a Int, Double or Long.
        
    result = eList.stream()
      .filter(e -> e.getRole().equals(Role.EXECUTIVE))
      .filter(e -> e.getState().equals("CO"))
      .mapToDouble(
          e -> e.getSalary() * Bonus.byRole(e.getRole()))
      .sum();
        
    System.out.printf("Total Bonuses paid: $%,6.2f %n", 
      result);

    System.out.println("\n== Total CO Bonus Details ==");
        
    result = eList.stream()
      .filter(e -> e.getRole().equals(Role.EXECUTIVE))
      .filter(e -> e.getState().equals("CO"))
      .peek(e -> System.out.print("Name: " 
        + e.getGivenName() + " " + e.getSurName() + " "))
       // mapToDouble returns a DoubleStream  
      .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
      .peek(d -> System.out.printf("Bonus paid: $%,6.2f %n", d))
      // The sum method for DoubleStream returns a double.
      // Therefore, the result variable must be a double.
      .sum();
        
    System.out.printf("Total Bonuses paid: $%,6.2f %n", result);    
  }  
}
