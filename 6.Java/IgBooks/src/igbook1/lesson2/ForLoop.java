package igbook1.lesson2;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            System.out.println("i: " + i);
        }

        String[] names = new String[3];

        names[0] = "Blue Shirt";
        names[1] = "Red Shirt";
        names[2] = "Black Shirt";

        int[] numbers = {100, 200, 300};

        // For-each loop also known as enhanced for looop
        // It used to access each successive value in a collection of values.
        // It is commonly used to iterate over an array or a Collections class e.g. Array or ArrayList.
        // Arrays are also objects by default.

        for (String name: names) {
            System.out.println("Name: " + name);
        }

        for (int number: numbers) {
            System.out.println("Number: " + number);
        }

    }
}
