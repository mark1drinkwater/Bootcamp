package ch7;

public class J_CustomizingRecords {
}

/*
Since records are data-oriented, we’ve focused on the features of records you are likely to
use. Records actually support many of the same features as a class. Here are some of the
members that records can include and that you should be familiar with for the exam:
■ Overloaded and compact constructors
■ Instance methods including overriding any provided methods (accessors, equals(),
hashCode(), toString())
■ Nested classes, interfaces, annotations, enum, and records
 */

record Crane10(int numberEggs, String name) {
    @Override public int numberEggs() { return 10; }
    @Override public String toString() { return name; }
}

//While you can add methods, static fields, and other data types, you cannot add instance
//fields outside the record declaration, even if they are private. Doing so defeats the purpose
//of using a record and could break immutability!
record Crane11(int numberEggs, String name) {
    private static int type = 10;
//    public int size; // DOES NOT COMPILE
//    private boolean friendly; // DOES NOT COMPILE

//    Records also do not support instance initializers. All initialization for the fields of a
//record must happen in a constructor.
}