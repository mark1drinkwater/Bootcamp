package ch1;

public class M_DataTypes {
    //    boolean true or false n/a n/a false true
//    byte 8-bit integral value -128 127 0 123
//    short 16-bit integral value -32,768 32,767 0 123
//    int 32-bit integral value -2,147,483,648 2,147,483,647 0 123
//    long 64-bit integral value -263 263 – 1 0L 123L
//    float 32-bit floating-point value n/a n/a 0.0f 123.45f
//    double 64-bit floating-point value n/a n/a 0.0 123.456
//    char 16-bit Unicode value 0 65,535 \u0000 'a

    // =========================
    // Literals
    long max = 3123456789L; // Now Java knows it is a long
    int million1 = 1000000;
    int million2 = 1_000_000;

//    double notAtStart = _1000.00; // DOES NOT COMPILE
//    double notAtEnd = 1000.00_; // DOES NOT COMPILE
//    double notByDecimal = 1000_.00; // DOES NOT COMPILE
//    double annoyingButLegal = 1_00_0.0_0; // Ugly, but compiles
//    double reallyUgly = 1__________2; // Also compiles

    // Distinguishing between Primitives and Reference Types
//     String reference = "hello";
//     int len = reference.length();
//     int bad = len.length(); DOES NOT COMPILE

    // Reference types can be assigned null but not primitives
//    int value = null; // DOES NOT COMPILE
//    String name = null;

}
