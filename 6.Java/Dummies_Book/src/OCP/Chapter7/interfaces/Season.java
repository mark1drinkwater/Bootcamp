package OCP.Chapter7.interfaces;

interface Weather { int getAverageTemperature(); }

public enum Season implements Weather {
    WINTER {
        @Override
        public String getHours() { return "10am-3pm"; }
    },
    SPRING {
        @Override
        public String getHours() { return "9am-5pm"; }
    },
    SUMMER {
        @Override
        public String getHours() { return "9am-7pm"; }
    },
    FALL {
        @Override
        public String getHours() { return "9am-5pm"; }
    };
    @Override
    public int getAverageTemperature() { return 30; }

    public abstract String getHours();

//    private final String expectedVisitors;

    private Season() {
//        this.expectedVisitors = expectedVisistors;
    }

//    public String printExpectedVisitors() {
//        return expectedVisitors;
//    }
}

//public enum ExtendedSeason extends Season {} // DOES NOT COMPILE

class SeasonTest {
    public static void main(String[] args) {
        var s = Season.SUMMER;
        System.out.println(s); // SUMMER
        System.out.println(Season.FALL);
        System.out.println(s == Season.SUMMER);

        for (var season : Season.values()) {
//            System.out.println("Expected business activity is " + " in " + season);
//            System.out.printf("Expected visited hours: %s in %s\n", season.getHours(), season);
            System.out.printf("Expected average temperature of: %d in %s\n", season.getAverageTemperature(), season);
        }

    }
}
