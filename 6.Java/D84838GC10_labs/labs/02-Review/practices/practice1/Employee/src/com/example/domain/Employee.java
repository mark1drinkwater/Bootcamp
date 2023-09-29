/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example.domain;

/**
 *
 * @author Mark
 */
public class Employee {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ssn
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * @param ssn the ssn to set
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // Declaring fields private prevents direct access to this data from a class instance
    private int id;
    private String name;
    private String ssn;
    private double salary;

    public Employee() {
        
    }
    
    // Best practices:
    /*
      Hide as many implementation details as possible.
      
      Two best practices for methods:
       -- Hide as many of the implementation details as possible.
       -- Name the method in a way that clearly indentifies its use or functionality.
    
      Encapsulation benefits:
       * Protects an object from unwanted access by clients.
       * Prevents assigning undesired values for its variables by the clients, which can make the state of an object unstable.
       * Allows changing the class implementation without modifying the client interface.
      
      Constructors in Subclasses:
        Subclasses does not inherit the constructors from its parent.
    */
    
}
