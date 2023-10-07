package OCP.Chapter9.generics;

public class Crate<T> {
    private T contents;


    public T lookInCrate() {
        return contents;
    }
    public void packCrate(T contents) {
        this.contents = contents;
    }
}

class Apple {
    public String name = "Shiny Red Apples";
    @Override
    public String toString() {
        return name;
    }
}

class TestCrate {
    public static void main(String[] args) {
        Crate<Apple> appleCrate = new Crate<>();
        appleCrate.packCrate(new Apple());
        System.out.println(appleCrate.lookInCrate());

        Crate<String> stringsCrate = new Crate<>();
        stringsCrate.packCrate("My name is Mr String");
        System.out.println(stringsCrate.lookInCrate());

//        Crate.<String>packCrate("package");
//        Crate.packCrate("package");


    }
}
