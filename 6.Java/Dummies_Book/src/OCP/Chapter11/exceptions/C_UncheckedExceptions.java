package OCP.Chapter11.exceptions;

public class C_UncheckedExceptions {
    // An unchecked exception is any exception that does not need to be
    // Declared or Handled by the code where it is thrown.
    // In Java, unchecked exceptions are any class that inherits RuntimeException or Error.

    // You can handle, declare an unchecked exception.
    // But it's better just to document it in a Javadoc comment.

    static void fall(String input) {
        System.out.println(input.toLowerCase());
    }


    public static void main(String[] args) {
        int[] arr = new int[3];
        // Example of a unchecked exception is a
        // ArrayIndexOutOfBoundsException
//        arr[4] = 1;

        fall(null);

    }
}
