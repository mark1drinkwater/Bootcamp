package OCP.Chapter11.exceptions;

import java.io.FileNotFoundException;

public class L_Finally {

    void explore() {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.println("Could not find your file.");
        } finally {
            System.out.println("This prints, no matter what.");
        }

        // DOES NOT COMPILE
//        try {
//            throw new FileNotFoundException();
//        } finally
//            System.out.println("Could not find your file.");
//        } catch (FileNotFoundException e) { {
//            System.out.println("This prints, no matter what.");
//        }

//        try { // DOES NOT COMPILE
//                throw new FileNotFoundException();
//            }
    }

        public static void main(String[] unused) {
            StringBuilder sb = new StringBuilder();
            try {
                sb.append("t");
            } catch (Exception e) {
                sb.append("c");
            } finally {
                sb.append("f");
            }
            sb.append("a");
            System.out.print(sb.toString());
        }

}

class MaybeFinally {

    public static void main(String[] args) {
        try {
            int rand = (int)(Math.random()*2 +1);
            System.out.println(rand);

            if (rand == 1) {
                throw new RuntimeException();
            }

            System.out.println("Phew, managed to dodge the exception.");
        } catch (RuntimeException e) {
            System.out.println("Error caught");
        } finally {
            System.out.println("I get here no matter what.");
        }
    }
}

class NeverGonnaGetThere {
    public static void main(String[] args) {
        try {
            System.exit(0);
        } finally {
            System.out.print("Never going to get here.");
        }
    }
}