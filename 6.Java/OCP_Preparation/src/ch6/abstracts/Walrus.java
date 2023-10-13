package ch6.abstracts;

abstract class Animal {
    public abstract String getName();
}

//public class Walrus extends Animal {} // DOES NOT COMPILE

public class Walrus extends Animal {

    @Override
    public String getName() {
        return "Walrus";
    }

    public static void main(String[] args) {
        Walrus wal = new Walrus();
        System.out.println(wal.getName());
    }
}
