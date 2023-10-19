package ch7;

public class M_LocalClass {
}

/*
A local class is a nested class defined within a method. Like local variables, a local class
declaration does not exist until the method is invoked, and it goes out of scope when the
method returns. This means you can create instances only from within the method. Those
instances can still be returned from the method. This is just how local variables work.

Local classes have the following properties:
■ They do not have an access modifier.
■ They can be declared final or abstract.
■ They have access to all fields and methods of the enclosing class (when defined in an
instance method).
■ They can access final and effectively final local variables
*/

class PrintNumbers {
    private final int length = 5;

    public static void main(String[] args) {
        var printer = new PrintNumbers();
        printer.calculate(); // 100
    }

    public void calculate() {
        final int width = 20;
        // Local class (it's inside a method)
        class Calculator {
            public void multiply() {
                System.out.print(length * width);
            }
        }
        var calculator = new Calculator();
        calculator.multiply();
    }

//    public void processData() {
//        final int length = 5;
//        int width = 10;
//        int height = 2;
//        class VolumeCalculator {
//            public int multiply() {
//                return length * width * height; // DOES NOT COMPILE. width not effectively final.
//            }
//        }
//        width = 2;
//    }
}