package igbook1.lesson5.finaltest;

public class MethodChildClass extends MethodParentClass {
//     compile-time error
//    @Override
//    public void printMessage() {
//        System.out.println("Cannot override methods");
//    }

// There is little to no performance benefit when declaring a method as final.
// It should be declared as final only to disable method overriding.
}
