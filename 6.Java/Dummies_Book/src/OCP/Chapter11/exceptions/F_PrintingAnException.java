package OCP.Chapter11.exceptions;

public class F_PrintingAnException {
    private static void hop() {
        throw new RuntimeException("Cannot hop");
    }

    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            // Three different ways to print an exception
            System.out.println("Let Java print it out:");
            System.out.println(e + "\n");

            System.out.println("Just print the message:");
            System.out.println(e.getMessage() + "\n");

            System.out.println("Print stack trace:");
            e.printStackTrace();
        }
    }
}

