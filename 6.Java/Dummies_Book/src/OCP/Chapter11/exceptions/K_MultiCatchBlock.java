package OCP.Chapter11.exceptions;

public class K_MultiCatchBlock {
    public static void main(String[] args) {
        // Notice we're displaying the exact same error message for both exceptions.
        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Missing or invalid input");
        } catch (NumberFormatException e) {
            System.out.println("Missing or invalid input");
        }

        // That's redundant code.
        // But we're smart and lazy coders!
        // Surely there's got to be a better way?
        // Yes there is!

        try {
            System.out.println(Integer.parseInt(args[1]));
        } catch (java.lang.ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Missing or invalid input");
        }


        // DOES NOT COMPILE
//        try {
//
//        } catch (Exception1 e | Exception2 e | Exception3 e) { // DOES NOT COMPILE
//
//        }

        // DOES NOT COMPILE
//        try {
//
//        } catch (Exception1 e1 | Exception2 e2 | Exception3 e3) {
//
//        }


        // DOES COMPILE
//        try {
//            int id = 1;
//            if (id == 1) {
//                throw new Exception1();
//            } else if (id == 2){
//                throw new Exception2();
//            } else if (id == 3) {
//                throw new Exception3();
//            }
//            // Remember only ever one of these 3 exceptions can be caught
//            // You can't throw or catch multiple exceptions.
//        } catch(Exception1 | Exception2 | Exception3 e) {
//            System.out.println("I've caught either Exception1 or 2 or 3.");
//        }


        // Multi-catch don't allow catching relatives
        // Does Not Compile.

        // Since FileNotFoundException is a subclass of IOException the code will not compile.

//        try {
//            throw new IOException();
//        } catch (FileNotFoundException | IOException p) {
//
//        }


    }



}

class Exception1 extends Exception {}
class Exception2 extends Exception {}
class Exception3 extends Exception {}