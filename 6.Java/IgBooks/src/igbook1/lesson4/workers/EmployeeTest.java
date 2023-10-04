package igbook1.lesson4.workers;

public class EmployeeTest extends Object {
    public static void main(String[] args) {
        Employee e = new Employee("Jim Smith", 101);
        Employee m = new Manager("Joan Kern", 102, "Marketing");

        System.out.println(e.getDetails());
        System.out.println(m.getDetails());

//        ((Manager) m).managerOnly();

        if (m instanceof Manager m2) {
            m2.managerOnly();
        } else {
            System.out.println("SORRY! ONLY managers are Allowed!");
        }


        // Polymorphism
        // Virtual Method Invocation (runtime behavior)
        Employee eMa = new Manager("John Smith", 104, "Public Relations");
        System.out.println(eMa.getDetails());

        // How to print out the name of the class that is executing a method.
        System.out.println(e.getClass().getName());

        // The Object equals Method
        // It only compares object references

        Employee x = new Employee("Mark", 400);
        Employee y = x;
        System.out.println(x.equals(y));  // true

        Employee z = new Employee("Mark", 400);
        System.out.println(x.equals(z));  // false

        // If we want to test the contents of the Employee object,
        // we need to override the equalls method.
    }
}
