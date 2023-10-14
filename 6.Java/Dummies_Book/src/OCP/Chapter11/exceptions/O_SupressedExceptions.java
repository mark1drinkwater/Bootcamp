package OCP.Chapter11.exceptions;

public class O_SupressedExceptions {
}

class TurkeyCage implements AutoCloseable {
    public static void main(String[] args) {
        try (var t = new TurkeyCage()) {
            System.out.println("Put turkeys in");
        }
    }

    public void close() {
        System.out.println("Close gate");
    }
}

class JammedTurkeyCage implements AutoCloseable {
    public static void main(String[] args) {
        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            System.out.println("Put turkeys in.");
        } catch (IllegalStateException e) {
            System.out.println("Caught: ");
            System.out.println(e.getMessage());
        }
    }

    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }
}

class JammedTurkeyCage2 implements AutoCloseable {
    public static void main(String[] args) {
        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            // We throw an exception in the try block
            throw new IllegalStateException("Turkeys ran off");
            // Catch block looks for the main exception
        } catch (IllegalStateException e) {
            System.out.println("Caught block: " + e.getMessage());
            for (Throwable t : e.getSuppressed())
                System.out.println("Suppressed: " + t.getMessage());
        }
    }

    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close (method)");
    }
}

// If we throw a primary exception
// It gets thrown first even if we don't handle it in the code.
class JammedTurkeyCage3 {
    public static void main(String[] args) {
        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            throw new RuntimeException("Turkeys ran off");
        } catch (IllegalStateException e) {
            System.out.println("caught: " + e.getMessage());
        }
    }
}

// Suppressed exceptions can only occur in the try block.
// Not the finally block
class JammedTurkeyCage4 {
    public static void main(String[] args) {
        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
            // This suppressed exception gets lost
            throw new IllegalStateException("Turkeys ran off");
        } finally {
            throw new RuntimeException("and we couldn't find them");
        }
    }
}