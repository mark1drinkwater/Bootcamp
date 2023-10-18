package com.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class A05AvoidStateful {

    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        List<Employee> newList01 = new ArrayList<>();
        List<Employee> newList02 = new ArrayList<>();
        
        eList.parallelStream() // Not Parallel. Bad.
            .filter(e -> e.getDept().equals("Eng"))
            // It's bad because you are directly changing (mutating) the elements of the stream!
            // Avoid Statefulness
            // Because you could have multiple threads working on a stream in parallel
            // One could be trying to add an item to the list
            // Another thread could be simultaneously trying to access an item from the list.
            .forEach(e -> newList01.add(e)); 

        newList02 = eList.parallelStream() // Good Parallel
            .filter(e -> e.getDept().equals("Eng"))
            // This avoids that problem because it is thread safe
            // It handles state and concurrency for you, under the hood.
            .collect(Collectors.toList());
        
    }
}
