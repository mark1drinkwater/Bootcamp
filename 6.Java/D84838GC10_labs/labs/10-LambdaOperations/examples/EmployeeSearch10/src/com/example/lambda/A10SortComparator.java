package com.example.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

/**
 *
 * @author oracle
 */
public class A10SortComparator {
  public static void main(String[] args) {
    List<Employee> eList = Employee.createShortList();
    
    System.out.println("\n== CO Bonus Details Comparator ==");
        
    // The sorted method can also take a Comparator as a parameter.
    // Combined with the comparing method, the Comparator class provides a great deal
    // of flexibility when sorting a stream.
    eList.stream()
      .filter(e -> e.getRole().equals(Role.EXECUTIVE))
      .filter(e -> e.getState().equals("CO"))
      // We tell the stream that we want to sort by surname.
      // Wow so we could pass any getter methods from the employee class and sort just like that!
      // So with one simple expression, a stream can be sorted by any available field.
      .sorted(Comparator.comparing(Employee::getSurName ))
      .forEach(Employee::printSummary);        

    System.out.println("\n== CO Bonus Details Reversed ==");
        
    eList.stream()
      .filter(e -> e.getRole().equals(Role.EXECUTIVE))
      .filter(e -> e.getState().equals("CO"))
      // The reverse, reverses the order of the elements from the sorted stream.
      .sorted(Comparator.comparing(Employee::getSurName).reversed())
      .forEach(Employee::printSummary);        
        
    System.out.println("\n== Two Level Sort, Dept then Surname ==");
        
    // Two Level Sort
    // The thenComparing method has been added to the comparing method.
    // This allows you to do a multilevel sort on the elements in the parameter.
    // The thenComparing method takes
    eList.stream()
      .sorted(
        // Sounds like a SQL SELECT * FROM tblEmployee GROUP BY dept, surName;
        // First sorts by dept then surName
        // But the output does not match that.......      
        Comparator.comparing(Employee::getDept)
          .thenComparing(Employee::getSurName))
      .forEach(Employee::printSummary);            
    }  
}
