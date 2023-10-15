package com.example.lambda;

import java.util.List;
import java.util.OptionalDouble;

/**
 *
 * @author oracle
 */
public class A09SortBonus {
  public static void main(String[] args) {
    List<Employee> eList = Employee.createShortList();
        
    System.out.println("\n== CO Bonus Details ==");
      
    // The sorted stream can be used to sort stream elements based on their natural order.
    // This is an intermediate operation.
    eList.stream()
      .filter(e -> e.getRole().equals(Role.EXECUTIVE))
      .filter(e -> e.getState().equals("CO"))
      // mapToDouble returns a double stream            
      .mapToDouble(e -> e.getSalary() * Bonus.byRole(e.getRole()))
      // So that we can call the sorted() method on it.
      .sorted()
      .forEach(d -> System.out.printf("Bonus paid: $%,6.2f %n", d));        
  }
}
