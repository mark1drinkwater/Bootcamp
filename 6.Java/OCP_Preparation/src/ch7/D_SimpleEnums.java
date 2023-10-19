package ch7;

public class D_SimpleEnums {
    public enum Season {
        WINTER, SPRING, SUMMER, FALL;
    }

    public static void main(String[] args) {
        var s = Season.SUMMER;
        System.out.println(Season.SUMMER); // SUMMER
        System.out.println(s == Season.SUMMER); // true

        // Calling the values(), name(), and ordinal() Methods
        for(var season: Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        // Calling the valueOf() Method
        Season s1 = Season.valueOf("SUMMER"); // SUMMER
//        Season t1 = Season.valueOf("summer"); // IllegalArgumentException

        // Enums in switch Statements
        Season summer = Season.SUMMER;
        switch(summer) {
            case WINTER:
                System.out.print("Get out the sled!");
                break;
            case SUMMER:
                System.out.print("Time for the pool!");
                break;
            default:
                System.out.print("Is it summer yet?");
        }

        var message = switch(summer) {
//            case Season.WINTER -> "Get out the sled!"; // DOES NOT COMPILE
//            case 0 -> "Time for the pool!"; // DOES NOT COMPILE
            default -> "Is it summer yet?";
        };
        System.out.print(message);
    }

//    public enum ExtendedSeason extends Season {} // DOES NOT COMPILE
}
