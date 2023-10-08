package OCP.Chapter7.interfaces;

public class Busi {
    public static void main(String[] args) {
        enum Season {WINTER,SPRING,SUMMER,AUTUMN};
        var s = Season.SUMMER;
        System.out.println(s);
        System.out.println(Season.AUTUMN);
        System.out.println(s==Season.SUMMER);

        for (var season: OCP.Chapter7.interfaces.Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }
    }
}