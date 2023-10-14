package OCP.Chapter11.exceptions;

public class G_RuntimeExceptionClasses {}

// ArithmeticException
// When you try to divide an int by zero.
class ArithmeticExceptionTest {
    public static void main(String[] args) {
        int answer = 11 / 0;
    }
}

// ArrayIndexOutOfBoundsException
// When you try to access an element of an array that doesn't exist.
class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] countsOfMoose = new int[3];
        System.out.println(countsOfMoose[-1]);
    }
}

// ClassCastException
// Java tries to protect you from impossible casts.
class CastExceptionTest {
    public static void main(String[] args) {
        String type = "moose";
        // DOES NOT COMPILE
//        Integer number = (Integer) type;


        Object obj = type;
        // This technically does compile
        // Because the compiler sees a cast from Object to Integer
        // So it thinks, okay a cast is not impossible.
        // But only when the code runs, oes it realises oh 😳 there's a String inside the object
        Integer number2 = (Integer) obj;
    }
}

// NullPointerException
// Instance variables & methods must be called on a non-null reference.
// If the reference is null, the JVM will throw a NullPointerException.
class Frog {
    // From Java 17, Java will even tell us which variable was the culprit! 😄
    public void hop(String name, Integer jump) {
        System.out.println(name.toLowerCase() + " " + jump.intValue());
    }

    public static void main(String[] args) {
        new Frog().hop(null, 1);

        new Frog().hop("Kermit", null);
    }
}

// IllegalArgumentException
// Used when you want to tell the caller that something is wrong.
class IllegalArgumentExceptionTest {
    int numberEggs;
    public void setNumberEggs(int numberEggs) {
        if (numberEggs < 0) {
            throw new IllegalArgumentException("Number of eggs must not be negative.");
        }
        this.numberEggs = numberEggs;
    }

    public static void main(String[] args) {
        var iaet = new IllegalArgumentExceptionTest();
        iaet.setNumberEggs(3);
        iaet.setNumberEggs(0);
        iaet.setNumberEggs(-5);
    }
}

// NumberFormatException
// When you attempt to convert an invalid string to a number.
// E.g. "51a" can't be converted to a number.
// Note: NumberFormatException is a subclass of IllegalArgumentException
class NumberFormatExceptionTest {
    public static void main(String[] args) {
        Integer.parseInt("54"); // Works
        Integer.parseInt("4545540a"); // NumberFormatException
    }
}