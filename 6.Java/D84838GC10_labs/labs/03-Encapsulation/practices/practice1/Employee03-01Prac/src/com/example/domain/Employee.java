package com.example.domain;

import java.text.NumberFormat;

public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }
    
    public void raiseSalary(double increase) {
        if (increase < 0)
            return;
        salary += increase;
    }
    
    public void printEmployee() {
        System.out.println(); // Print a blank line as a separator
        // Print out the data in this Emloyee object
        System.out.println("Employee id:        " + getEmpId());
        System.out.println("Employee name:      " + getName());
        System.out.println("Employee Soc Sec #  " + getSsn());
        System.out.println("Employee salary:  " + 
            NumberFormat.getCurrencyInstance().format((double) getSalary()));
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals(""))
            return;
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public String getSsn() {
        return ssn;
    }

}
