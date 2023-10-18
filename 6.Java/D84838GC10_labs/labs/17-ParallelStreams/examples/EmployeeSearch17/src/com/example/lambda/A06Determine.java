package com.example.lambda;

import java.util.List;


/**
 *
 * @author oracle
 */
public class A06Determine {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        // A determinstic algorithm is an algorithm that given a particular input
        // E.g. 1, 2, 3, 4  and to sum, will always yield 10
        // Sum great example of the order of the elements not mattering, example 3, 2, 1, 4 sum -> still yields 10.
        
        
        double r1 = eList.stream()
            .filter(e -> e.getState().equals("CO"))
            .mapToDouble(Employee::getSalary)
            .sequential().sum();
        
        double r2 = eList.stream()
            .filter(e -> e.getState().equals("CO"))
            .mapToDouble(Employee::getSalary)
            .parallel().sum();
        
        System.out.println("The same: " + (r1 == r2));
    }
}
