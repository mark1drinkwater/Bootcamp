package com.example.lambda;

import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author oracle
 */
public class ConsumerTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    
    // Write your consumer lambda here
    Consumer<Employee> eCons = 
            t -> System.out.println("Name: " + t.getSurName() + 
                    " Role: " + t.getRole() + "   Salary: " + t.getSalary() );
    
    System.out.println("=== First Salary");
    // Call your consumer here
    eCons.accept(first);
  }
}
