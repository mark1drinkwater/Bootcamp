package OCP.Chapter7.interfaces;

 interface ZooRenovation {
    String projectName();
    String status();

    default void printStatus() {
        System.out.print("The " + projectName() + " project is " + status());
    }

}

public class Zoo implements ZooRenovation {
    @Override
    public String projectName() {
        return "Mega Zoo";
    }

    @Override
    public String status() {
        return "under construction";
    }

    public static void main(String[] args) {
        Zoo z = new Zoo();
        z.printStatus();
    }
}