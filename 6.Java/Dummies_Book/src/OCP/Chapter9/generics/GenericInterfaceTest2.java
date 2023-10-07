package OCP.Chapter9.generics;

public class GenericInterfaceTest2 {

    public static void main(String[] args) {
        Shippable sac = new ShippableAbstractCrate<Animal>();
        Shippable src = new ShippableRobotCrate<Robot>();
        Shippable src2 = new ShippableRobotCrate<>();
    }
}

class Robot{}
class Animal {}
