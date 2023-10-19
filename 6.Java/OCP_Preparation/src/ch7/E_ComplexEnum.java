package ch7;

public class E_ComplexEnum {
    public enum Season {
        // WINTER calls the constructor with the parameter LOW same for SPRING etc
        WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");
        private final String expectedVisitors;
        // Enum constructors are implicitly private.
        Season(String expectedVisitors) {
            this.expectedVisitors = expectedVisitors;
        }

        public void printExpectedVisitors() {
            System.out.println(expectedVisitors);
        }
    }

    public static void main(String[] args) {
        System.out.println(Season.WINTER);
        Season.WINTER.printExpectedVisitors();
    }
}

class AnotherEnum {
    enum OnlyOne {
        ONCE(true);
        private OnlyOne(boolean b) {
            System.out.print("constructing,");
        }
    }
    public static void main(String[] args) {
        System.out.print("begin,");
        OnlyOne firstCall = OnlyOne.ONCE; // Prints constructing,
        OnlyOne secondCall = OnlyOne.ONCE; // Doesn't print anything
        System.out.print("end");
    }
}

class MoreEnums {
    enum Season1 {
        WINTER {
            public String getHours() { return "10am-3pm"; }
        },
        SPRING {
            public String getHours() { return "9am-5pm"; }
        },
        SUMMER {
            public String getHours() { return "9am-7pm"; }
        },
        FALL {
            public String getHours() { return "9am-5pm"; }
        };
        // The enum itself has an abstract method.
        // This means that each and every enum value is required to implement this method.
        public abstract String getHours();
    }
    ////////////////////////////////////////
    // What if we don't want to be forced to implement a method on every enum?
    enum Season2 {
        WINTER {
            public String getHours() { return "10am-3pm"; }
        },
        SUMMER {
            public String getHours() { return "9am-7pm"; }
        },
        SPRING, FALL;
        public String getHours() { return "9am-5pm"; }
    }
    //////////////////////////////
    // Enums can even implement an interface:
    public interface Weather { int getAverageTemperature(); }
    public enum Season implements Weather {
        WINTER, SPRING, SUMMER, FALL;
        public int getAverageTemperature() { return 30; }
    }
}