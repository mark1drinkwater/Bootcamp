package com.example;

/**
 *
 * @author Mark
 */
public class Main {

    public static void main(String[] args) {
        Employee jane = new Employee("Jane Doe", "Manager", "HR", 65000);
        Employee john = new Employee("John Doe", "Staff", "HR", 55000);
        
        System.out.println("Jane's witholding: " + jane.getWithholding());
        System.out.println("John's bonus " + john.getBonus());
    }
    
}
