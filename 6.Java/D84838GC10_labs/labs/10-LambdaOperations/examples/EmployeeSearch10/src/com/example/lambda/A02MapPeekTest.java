package com.example.lambda;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A02MapPeekTest {
    
    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();
                
        System.out.println("\n== CO Bonuses ==");
        eList.stream()
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .filter(e -> e.getState().equals("CO"))
            // The peek method of the Stream class allows you to perform an operation on an element in the stream. 
            // The elements are returned to the stream and are available to the next stream in the pipeline. 
            // The peek method can be used to read or change data in the stream.
            // Whereas forEach would terminate the stream since its return type is void.
            // Manipulating data using peek is strongly discouraged as it is not thread-safe.
            .peek(e -> System.out.print("Name: " 
              + e.getGivenName() + " " + e.getSurName()))
            .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
            .forEach( s -> 
              System.out.printf(
                "  Bonus paid: $%,6.2f %n", s));
        
      
        System.out.println("\n== Manager Bonus Report ==");
        eList.stream()
            .filter(e -> e.getRole().equals(Role.MANAGER))
            .filter(e -> e.getDept().equals("Eng"))
            .peek(e -> System.out.print("Name: " 
              + e.getGivenName() + " " + e.getSurName()))
            .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
            .forEach( 
                s -> System.out.printf(
                  "  Bonus paid: $%,6.2f %n", s));
    }  
}