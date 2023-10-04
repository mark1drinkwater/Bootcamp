package igbook1.lesson4.workers;

import java.util.Objects;

public class Employee {
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private int empId;
    private String name;
    private double salary = 25_000;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public String getDetails() {
        return "ID: " + empId + " Name: " + name + "Salary: " + salary;
    }
    // Overriding the toString method:
    // better approach t getting details about your class than creating your own getDetails method
    // Because the System.out.println takes an Object parameter, this in turn invokes the toString() method on the object instance.
    @Override
    public String toString() {
        return "ID: " + empId + " Name: " + name + "Salary: " + salary;
    }

    public double getSalary() {
        return this.salary;
    }

    // In the Employee class
    // Good practice is to design & write methods that take the most generic form of your object possible.
    public double calcBonus() {
        return this.getSalary() * GoodBonus.getBonusPercent(this);
    }

    // @Override annotation
    /*
      This annotation is used to instruct the compiler that method annotated with @Override is an overridden method from super class or interface.
      The compiler checks to make sure you are overriding a method when you think you are.
      This way, if you make a common mistake of misspelling a method name or not correctly matching the parameters, you will be warned.
      It also makes it easier to see that your code is actually overriding methods.
     */
    @Override
    public boolean equals(Object o) {
        boolean result = false;
        // The old way
//            if ((o != null) && (o instanceof Employee)) {
//                Employee e = (Employee) o;
        // The new way with pattern matching
        if ((o != null) && (o instanceof Employee emp1)) {
            if ( (emp1.getEmpId() == this.empId ) &&
                    (emp1.getName().equals(this.name) &&
                            (emp1.getSalary() == this.salary))) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name, salary);
    }
}
