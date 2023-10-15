package com.example.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class A16CollectPartition {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        Map<Boolean, List<Employee>> gMap = new HashMap<>();
       
        // The partioningBy method offers an interesting way to create a Map
        // The method takes a Predicate as an argument
        // And creates a Map with 2 Boolean keys
        // One key is true & includes all elements that met the true criteria
        // The other key, false -> contains all elements that resulted in false.
        gMap = eList.stream()
            .collect(                    
                Collectors.partitioningBy(
                    e -> e.getRole().equals(Role.EXECUTIVE)));   
        // The true key contains the elements that meet the criteria of being an executive.
        // The false key contains elements that don't meet the criteria of being an executive.

        System.out.println("\n== Employees by Dept ==");
        gMap.forEach((k,v) -> {
            System.out.println("\nGroup: " + k); 
            v.forEach(Employee::printSummary);
        });
                
    }
    
}
