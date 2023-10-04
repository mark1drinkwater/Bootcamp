package igbook1.lesson4.workers;

public class Manager extends Employee {
    private String deptName;

    public Manager(String name, int empId, String deptName) {
        super(name, empId);
        this.deptName = deptName;
    }
    // Lines omitted

    public void managerOnly() {
        System.out.println("Here are your secret manager only files!!!");
    }

    @Override
    public String getDetails() {
        return super.getDetails() + " Dept: " + deptName;
    }
    // Note: If a class declares 2 public methods with the same name,
    // and a subclass overrides one of them, the subclass still inherits the other method.
}
