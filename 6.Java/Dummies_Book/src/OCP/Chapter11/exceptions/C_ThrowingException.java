package OCP.Chapter11.exceptions;

public class C_ThrowingException {
    public static void main(String[] args) throws Exception {
        // 2nd way to cause an exception is to explicitly request Java to throw one.

        // Default exception (no String parameters)
//        throw new Exception();

        // Exception with a message.
//        throw new Exception("Ow! I fell.");

//        throw new RuntimeException();
//        throw new RuntimeException("Ow! I fell.");


        // An Exception is an Object
        // So we can store it in an object reference

        var e = new RuntimeException();
        throw e;

        // DOES NOT COMPILE. It's missing the new keyword.
//        throw RuntimeException();
    }
}

class C_2 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
            // Why does this not compile?
//            throw new ArrayIndexOutOfBoundsException();
        } catch (Exception e) {}
    }
}