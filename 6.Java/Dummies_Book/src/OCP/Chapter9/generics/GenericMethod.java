package OCP.Chapter9.generics;

public class GenericMethod {
    public static <T> void prepare(T t) {
        System.out.println("Preparing " + t);
    }

    public static <T> Crate<T> ship(T t) {
        System.out.println("Shipping " + t);
        return new Crate<T>();
    }


    public static void main(String[] args) {
        Apple apple = new Apple();

        prepare(apple);
        Crate<Apple> appleCrate = ship(apple);

        GenericMethod.<String>ship("package");

    }
}

class More {
    public static <T> void sink(T t) {

    }

    public static <T> T identity(T t) {
        return t;
    }

    public static <T> T noGood(T t) {
        return t;
    } // DOES NOT COMPILE
}