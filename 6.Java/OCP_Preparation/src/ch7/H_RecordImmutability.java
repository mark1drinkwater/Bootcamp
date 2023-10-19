package ch7;

public class H_RecordImmutability {
}

//    Understanding Record Immutability
//        As you saw, records don’t have setters. Every field is inherently final and cannot be modified
//        after it has been written in the constructor. In order to “modify” a record, you have to make
//        a new object and copy all of the data you want to preserve.
//        var cousin = new Crane(3, "Jenny");
//        var friend = new Crane(cousin.numberEggs(), "Janeice");
//        Just as interfaces are implicitly abstract, records are also implicitly final. The final
//modifier is optional but assumed.
final record Crane4(int numberEggs, String name) {}
//    Like enums, that means you can’t extend or inherit a record.
//public record BlueCrane() extends Crane4 {} // DOES NOT COMPILE

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Declaring Constructors ---- Long Constructors
record Crane5(int numberEggs, String name) {
    public Crane5(int numberEggs, String name) {
        if (numberEggs < 0) throw new IllegalArgumentException();
        this.numberEggs = numberEggs;
        this.name = name;
    }
}

//record Crane20(int numberEggs, String name) {
//    public Crane20(int numberEggs, String name) {
////        this.numberEggs = numberEggs;
////        this.name = name;
//    } // DOES NOT COMPILE
//// Since each field is assumed final, you must initialise it.
//}

//////////////////////////////// Manually initialising each fields defeats the point of records, if there was only a better way to add gard classes -------
// Oh, but there is!
// By declaring a compact constructor
//A compact constructor is a special type of constructor used for records to process validation
//        and transformations succinctly. It takes no parameters and implicitly sets all fields.

// Yay! Now we can have a record
record Crane6(int numberEggs, String name) {
    public Crane6 {
        if (numberEggs < 0) throw new IllegalArgumentException();
        name = name.toUpperCase();
    }
}