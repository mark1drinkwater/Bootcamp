package com.gmail.markdrinkwater.Payroll;

public class Employee implements Cloneable {

    /** Represents an employee.
     * @author Doug Lowe
     * @author www.LoweWriter.com
     * @version 1.5
     * @since 1.0
     */
    private String lastName;
    private String firstName;
    private Double salary;
    public Address address;
    /** Creates an employee with the specified name.
     * @param lastName The employee's last name.
     * @param firstName The employee's first name.
     */
    public Employee(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = new Address();
    }
    /** Gets the employee's last name.
     * @return A string representing the employee's last
     * name.
     */
    public String getLastName() {
        return this.lastName;
    }
    /** Sets the employee's last name.
     * @param lastName A String containing the employee's
     * last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /** Gets the employee's first name.
     * @return A string representing the employee's first
     * name.
     */
    public String getFirstName() {
        return this.firstName;
    }
    /** Sets the employee's first name.
     * @param firstName A String containing the
     * employee's first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /** Gets the employee's salary.
     * @return A double representing the employee's salary.
     */
    public Double getSalary() {
        return this.salary;
    }
    /** Sets the employee's salary.
     * @param salary A double containing the employee's
     * salary.
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Object clone() {
        Employee emp;
        try {
            emp = (Employee) super.clone();
            emp.address = (Address) address.clone();
        } catch (CloneNotSupportedException e) {
            return null; // will never happen
        }
        return emp;
    }

    public String toString() {
        return this.getClass().getName() + "["
                + this.firstName + " "
                + this.lastName + ", "
                + this.salary + "]";
    }
}