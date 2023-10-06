package OCP.Chapter9.generics;

public class TrickyCrate<T> {
    public <T> T tricky(T t) {
        return t;
    }

    public static String createName() {
        TrickyCrate<Robot> crate = new TrickyCrate<>();
        return crate.tricky("bot");
    }

    public static Robot createName2() {
        TrickyCrate<Robot> crate = new TrickyCrate<>();
        return crate.tricky(new Robot());
    }

    public static void main(String[] args) {
        System.out.println(createName());
        System.out.println(createName2());
    }
}
