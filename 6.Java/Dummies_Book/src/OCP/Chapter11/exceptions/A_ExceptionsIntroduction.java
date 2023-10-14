package OCP.Chapter11.exceptions;

import java.util.NoSuchElementException;

public class A_ExceptionsIntroduction {
    // ====== Exceptions ==========
    public static int indexOf(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] petNames = {"Daisy", "Bella", "Coco", "Badger", "Rex", "Milo"};

        int resultCode1 = indexOf(petNames, "Coco");
        System.out.println("Coco has been found at index position: " + resultCode1); // 2

        int resultCode2 = indexOf(petNames, "Pooch");
        System.out.println("Pooch has been found at index position: " + resultCode2); // -1

        // Oh no! Pooch is not found in the arrray.
        // So it returns -1
        // Which is to say, the pet name you were search for does not exist in the array.

        // While common for certain tasks like searching, return codes should be generally avoided.
        // After all that's what exceptions are for!

    }
}

////////////////////////////////////////////
///// Let's see if we can re-write it using Exceptions

class A_ExceptionsIntroImproved {
    public static int indexOfImproved(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return i;
            }
        }
        throw new NoSuchElementException("Sorry, your beloved " + name + " could not be located");
    }

    public static void main(String[] args) {
        String[] petNames = {"Daisy", "Bella", "Coco", "Badger", "Rex", "Milo"};

        try {
            int result = indexOfImproved(petNames, "Pooch");
            System.out.println("Your pet has been located at position: " + result);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }


}