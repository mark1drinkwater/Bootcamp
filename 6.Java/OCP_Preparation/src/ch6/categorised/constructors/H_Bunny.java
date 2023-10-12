package OCP.Chapter6.subclasses.constructors;

public class H_Bunny {
    String name;
    public H_Bunny() {
        System.out.print("hop");
    }
    public H_Bunny(String name) {
        this.name = name;
    }
    public void Bunny() {
        System.out.println("Not a constructor.");
    }

    public static void main(String[] args) {
        OCP.Chapter6.subclasses.constructors.H_Bunny b1 = new OCP.Chapter6.subclasses.constructors.H_Bunny();
        OCP.Chapter6.subclasses.constructors.H_Bunny b2 = new OCP.Chapter6.subclasses.constructors.H_Bunny();
        OCP.Chapter6.subclasses.constructors.H_Bunny b3 = new OCP.Chapter6.subclasses.constructors.H_Bunny();
    }

}