package com.example.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author oracle
 */
public class A06StreamData {

  public static void main(String[] args) {
        
    List<Employee> eList = Employee.createShortList();
                            
    System.out.println("\n== Executive Count ==");
    long execCount = 
        eList.stream()
          .filter(e -> e.getRole().equals(Role.EXECUTIVE))
          .count();
       
    System.out.println("Exec count: " + execCount);
        
    // Max returns the highest matching value given a comparator to rank elements
    // The max method is a terminal operator
    System.out.println("\n== Highest Paid Exec ==");
    // The return type is Optional.
    // This is not the generic <> version used in previous examples.
    Optional highestExec =
      eList.stream()
        .filter(e -> e.getRole().equals(Role.EXECUTIVE))
        // Sorts the executives by the salary.
        .max(Employee::sortBySalary);
        
    if (highestExec.isPresent()){
      // Therefore a cast is required when the object is retrieved.
      Employee temp = (Employee) highestExec.get();
      System.out.printf(
          "Name: " + temp.getGivenName() + " " 
          + temp.getSurName() + "   Salary: $%,6.2f %n ", 
          temp.getSalary()); 
    }
        
    System.out.println("\n== Lowest Paid Staff ==");
    Optional lowestStaff =
        eList.stream()
         .filter(e -> e.getRole().equals(Role.STAFF))
         // The min method returns the lowest matching value given a Comparator to rank elements.
         // The min method is a terminal operation.
         // In this example, a different Comparator is used./
         // The comparingDouble static method is called to make the comparison.             
         .min(Comparator.comparingDouble(e -> e.getSalary()));
        
    if (lowestStaff.isPresent()){
      Employee temp = (Employee) lowestStaff.get();
      System.out.printf("Name: " + temp.getGivenName() 
        + " " + temp.getSurName() + 
        "   Salary: $%,6.2f %n ", temp.getSalary());  
    }   
  }
}
