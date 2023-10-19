package ch7;

public class G_Records {
}

// POJO -- Plain Old Java Object
class Crane {
    int numberEggs;
    String name;

    public Crane(int numberEggs, String name) {
        this.numberEggs = numberEggs;
        this.name = name;
    }
}

////////////////////////////////////////////////////////////
// Newly encapsulated (and immutable) Crane class:
// An immutable object is an object-orientated design pattern in which an object cannot be modifed after it's created.
final class Crane2 {
    private final int numberEggs;
    private final String name;

    public Crane2(int numberEggs, String name) {
        if (numberEggs >= 0) this.numberEggs = numberEggs; // guard condition
        else throw new IllegalArgumentException();
        this.name = name;
    }

    public int getNumberEggs() { // getter
        return numberEggs;
    }

    public String getName() { // getter
        return name;
    }
}

//// This is the same as the above, excluding the guard clause.
record Crane3(int numberEggs, String name) { }
// For each field it also creates an accessor as the field name, unlike traditional methods it doesn't
// have the prefix get or is. Just a few less characters you need to type!

class TestRecord {
    public static void main(String[] args) {
        var mommy = new Crane3(4, "Cammy");
        System.out.println(mommy.numberEggs());
        System.out.println(mommy.name());

        var father = new Crane(0, "Craig");
        System.out.println(father); // Crane[numberEggs=0, name=Craig]
        var copy = new Crane(0, "Craig");
        System.out.println(copy); // Crane[numberEggs=0, name=Craig]
        System.out.println(father.equals(copy)); // true
        System.out.println(father.hashCode() + ", " + copy.hashCode()); // 1007, 1007
    }
}

/*
Members Automatically Added to Records
■ Constructor: A constructor with the parameters in the same order as the record
declaration
■ Accessor method: One accessor for each field
■ equals(): A method to compare two elements that returns true if each field is equal in
terms of equals()
■ hashCode(): A consistent hashCode() method using all of the fields
■ toString(): A toString() implementation that prints each field of the record in a
convenient, easy-to-read format
 */