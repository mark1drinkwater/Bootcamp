package com.example;

public class Employee {

    private String name;
    private String role;
    private String dept;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String role, String dept, double salary) {
        this.name = name;
        this.role = role;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }
    
    private BenefitsHelper helper = new BenefitsHelper();
    
    class BenefitsHelper {
        private final double bonusRate = 0.02;
        private final double witholdingRate = 0.07;
        
        protected double calcBonus(double salary) {
            return salary * bonusRate;
        }
        
        protected double calcWitholding(double salary) {
            return salary * witholdingRate;
        }
    }
    
    public double getWithholding() {
        return helper.calcWitholding(salary);
    }
    
    public double getBonus() {
        return helper.calcBonus(salary);
    }

}


