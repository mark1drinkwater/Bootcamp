package igbook1.lesson4.workers;

public class BadManager extends Employee {
    private String deptName;

    public BadManager(String name, int empId) {
        super(name, empId);
    }
    // lines omitted

//    Compile error. Overriding method can't be less accessible than method in parent class.
//    @Override
//    private String getDetails() {}
}
