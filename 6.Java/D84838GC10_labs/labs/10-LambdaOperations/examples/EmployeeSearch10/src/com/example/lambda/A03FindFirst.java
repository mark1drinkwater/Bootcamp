package com.example.lambda;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author oracle
 */
public class A03FindFirst {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        System.out.println("\n== First CO Bonus ==");
        
        // Notice we're using an Optional type.
        // Because findFirst may or may not return an employee.
        Optional<Employee> result = eList.stream()
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .filter(e -> e.getState().equals("CO"))
            // Return the first Executive in Colorado
            // It is a short-circuit operation because the pipeline will end when the first is found.
            .findFirst();
        
        if (result.isPresent()){
            result.get().print();
        }
        
    }
    
}
