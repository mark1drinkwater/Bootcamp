package igbook1.lesson2;
// imports
import java.util.Date;
// By default, your class always imports java.lang.*
// You don't need to import classes that are in the same package.

public class Employee {  // class declaration
    // Fields
    public int empId;
    public String name;
    public final int VISA_CARD = 5001;
    public String ssn;
    public double salary;

    // constructor
    public Employee() {}

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void changeMyId(Employee emp) {
        emp.empId = 200;
        System.out.println("No! Your emp id is " + emp.empId);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.empId = 101; // legal if the field is public but not good 00 practice.
        emp.setEmpId(101); // use a method instead
        // Invoking an instance method.
//        emp.setName("John Smith");
//        emp.setSsn("011-22-3467");
//        emp.setSalary(120345.27);
        System.out.println(emp.empId);
        emp.changeMyId(emp);
        System.out.println("Did you really change my empId? " + emp.empId );
        // The scope of emp ends. and it becomes eligible for garbage collection.
        Date dat1 = new Date();
        java.sql.Date sqlDate = new java.sql.Date(2022,4,12);
    }

}
