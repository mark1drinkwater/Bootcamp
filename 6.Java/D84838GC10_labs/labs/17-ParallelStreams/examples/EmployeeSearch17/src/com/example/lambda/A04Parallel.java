package com.example.lambda;

import java.util.List;

/**
 *
 * @author oracle
 */
public class A04Parallel {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        System.out.println("Parallel Stream: ");
        double result = eList.parallelStream()
            .filter(e -> e.getState().equals("CO"))
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .peek(e -> e.printSummary())
            .mapToDouble(e -> e.getSalary())
            .sum();
        
        System.out.printf("Total CO Executive Pay: $%,9.2f %n", result);
        
        System.out.println("\n");
        
        // Call parallel from pipeline
        System.out.println("Call Parallel from pipeline: ");
        result = eList.stream()
            .filter(e -> e.getState().equals("CO"))
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .peek(e -> e.printSummary())
            .mapToDouble(e -> e.getSalary())
            .parallel()
            .sum();
        
        System.out.printf("Total CO Executive Pay: $%,9.2f %n", result);               
    
        System.out.println("\n");
        
        // Call sequential from pipeline
        System.out.println("Call Sequential from pipeline: ");
        result = eList.stream()
            .filter(e -> e.getState().equals("CO"))
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .peek(e -> e.printSummary())
            .mapToDouble(e -> e.getSalary())
            .sequential()
            .sum();
        
        System.out.printf("Total CO Executive Pay: $%,9.2f %n", result);               
    }
}
