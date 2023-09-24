/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter3;

/**
 *
 * @author Mark
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    // Typical switch statement:
    public void printDayOfWeek(int day) {
        if (day == 0) {
            System.out.print("Sunday");
        } else if (day == 1) {
            System.out.print("Monday");
        } else if (day == 2) {
            System.out.print("Tuesday");
        } else if (day == 3) {
            System.out.print("Wednesday");
        }
    }

    // From Java 14 onwards
    switch (animal) {
        case 1, 2:
            System.out.print("Lion");
        case 3:
            System.out.print("Tiger");
    }
            
    int month = 5;
    switch month             { // DOES NOT COMPILE
        case 1:
            System.out.print("January");
    }
            
    switch(month

    ) // DOES NOT COMPILE
    case 1: System.out.print (
            
    "January");
    switch (month) {
        case 1:
            2 : System.out.print("January"); // DOES NOT COMPILE
    }

    final int getCookies() {
        return 4;
    }

    void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch (numberOfAnimals) {
            case bananas:
            case apples: // DOES NOT COMPILE
            case getCookies(): // DOES NOT COMPILE
            case cookies: // DOES NOT COMPILE
            case 3 * 5:
        }
    }

    public void printDayOfWeek(int day) {
        var result = switch (day) {
            case 0 ->
                "Sunday";
            case 1 ->
                "Monday";
            case 2 ->
                "Tuesday";
            case 3 ->
                "Wednesday";
            case 4 ->
                "Thursday";
            case 5 ->
                "Friday";
            case 6 ->
                "Saturday";
            default ->
                "Invalid value";
        };
        System.out.print(result);
    }

    public void printSeason(int month) {
        switch (month) {
            case 1, 2, 3 ->
                System.out.print("Winter");
            case 4, 5, 6 ->
                System.out.print("Spring");
            case 7, 8, 9 ->
                System.out.print("Summer");
            case 10, 11, 12 ->
                System.out.print("Fall");
        }
    }

    int measurement = 10;
    int size = switch (measurement) {
        case 5 ->
            1;
        case 10 ->
            (short) 2;
        default ->
            5;
        case 20 ->
            "3"; // DOES NOT COMPILE
        case 40 ->
            4L; // DOES NOT COMPILE
        case 50 ->
            null; // DOES NOT COMPILE
    };

    int fish = 5;
    int length = 12;
    var name = switch (fish) {
        case 1 ->
            "Goldfish";
            // Similar to lambda. If just 1 statement it automatically gets returned.
            // Otherwise require yield to prevent ambiguidy
        case 2 -> {
            yield "Trout";
        }
        case 3 -> {
            if (length > 10) {
                yield "Blobfish";
            } else {
                yield "Green";
            }
        }
        default ->
            "Swordfish";
    };

}
