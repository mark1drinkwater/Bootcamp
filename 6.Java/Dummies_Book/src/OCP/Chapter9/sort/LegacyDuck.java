package OCP.Chapter9.sort;

public class LegacyDuck implements Comparable {
    private String name;
    @Override
    public int compareTo(Object obj) {
        LegacyDuck d = (LegacyDuck) obj;
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        var a1 = new LegacyDuck();
        var a2 = new LegacyDuck();
        a1.name = "Donald";
        a2.name = "Duck";
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a1));
        System.out.println(a2.compareTo(a1));
    }
}
