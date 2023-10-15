package com.example.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class A15CollectCount {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        Map<String, Long> gMap = new HashMap<>();
       
        // Collect CO Executives
        gMap = eList.stream()
            .collect(
                // Another version of groupingBy takes a Function & Collector as parameters
                // and returns a Map.
                Collectors.groupingBy(
                        // Instead of simply returning them it counts them too!
                    e -> e.getDept(), Collectors.counting()));        

        System.out.println("\n== Employees by Dept ==");
        gMap.forEach((k,v) -> 
            System.out.println("Dept: " + k + " Count: " + v)
        );
                
    }
    
}
