package com.example.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class A13CollectJoin {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
       
        // Collect CO Executives
        String deptList = eList.stream()
            .map(Employee::getDept)
            // Distinct removes an duplicate values.
            .distinct()
            // The joining method allows you to join together elements
            // In this case, join them together with commas.
            .collect(Collectors.joining(", "));        

        System.out.println("\n== Dept List ==");
        System.out.println("Total: " + deptList);        
                
    }
    
}
