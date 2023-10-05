package igbook1.lesson2;

public class SwitchStringStatement {
    public static void main(String[] args) {
        String color = "Blue";
        String shirt = " Shirt";

        // Breaks are important because without them, the statements just fall through.
        // Switch can only test: Integer, Character, Enums, String
        switch (color) {
            case "Blue":
                shirt = "Blue" + shirt;
                break;
            case "Red":
                shirt = "Red" + shirt;
                break;
            default:
                shirt = "White" + shirt;
        }
        System.out.println("Shirt type: " + shirt);
    }
}
