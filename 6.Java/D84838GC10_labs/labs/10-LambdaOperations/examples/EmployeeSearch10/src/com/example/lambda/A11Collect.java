package com.example.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class A11Collect {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        List<Employee> nList = new ArrayList<>();
       
        // Collect CO Executives
        // This method allows you to save the results of all the filtering, mapping, sorting
        // that takes place in a pipeline.
        // The collect method takes a Collectors class as a parameter.
        // The Collectors class provides a number of ways to return elements left in a pipeline.
        nList = eList.stream()
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .filter(e -> e.getState().equals("CO"))
            .sorted(Comparator.comparing(Employee::getSurName))
            // The result fo the pipeline gets saved to a list basically.
            .collect(Collectors.toList());        

        System.out.println("\n== CO Bonus Details ==");
        
        nList.stream()
            .forEach(Employee::printSummary);        
                
    }
    
}
