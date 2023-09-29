/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

import com.example.domain.Employee;

/**
 *
 * @author Mark
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Jane Smith");
        emp.setSsn("012-34-5678");
        emp.setSalary(120_345.27);
        
        System.out.println("Employee id:        " + emp.getId());
        System.out.println("Employee name:      " + emp.getName());
        System.out.println("Employee Soc Sec #: " + emp.getSsn());
        System.out.println("Employee salary:    " + emp.getSalary());
        
        String s1 = "Test";
        String s2 = "Test";
        
        if (s1 == s2) {
            System.out.println("Same");
        if (s1.equals(s2))
            System.out.println("Equals"); 
        }
        
    }
    
}
