package OCP.Chapter11.exceptions;

import java.io.IOException;

public class B_CheckedExceptions {
    // Checked exceptions is an exception that must either be declared or handled.
    // They must be Handled in a try-catch block.
    // Or Declared in the method signature.

    // Example time:
    // We Declare the exception in the method signature.
    static void fallDeclare(int distance) throws IOException {
        if (distance > 10) {
            throw new IOException();
        }
    }

    // We Handle the exception using a try-catch block.
    static void fallHandle(int distance) {
        try {
            if (distance > 10) {
                throw new IOException();
            }
        } catch (Exception e) {
            System.out.println("Phew, thanks for handling my fall!");
            e.printStackTrace();;
        }
    }

    public static void main(String[] args) {
        fallHandle(25);

        System.out.println();


        // When you throw an Exception in the method signature
        // The method basically, says this exception is not my problem.
        // Let whoever is calling me, take care of it.

        // The main method is calling the fallDeclare method, so it must handle the error
        try {
            fallDeclare(25);
        } catch (IOException e) {
            System.out.println("Phew, luckily you're here to catch me!");
            e.printStackTrace();
        }
    }
}