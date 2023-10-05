package igbook1.lesson2;

public class Literals {

    // Every class declaration consists of a code block using {}.
    // Every method....
    // Java fields & methods have their own block scope.


    public static void main(String[] args) {
        ////////////////////////////////////////////////////
        // Data Types: (Integer based)
        byte myByte = 127;  // 8 bits signed
        short myShort = 32767;  // 16 bits signed
        int myInt = 75765764;  // 32 bits signed
        long myLong = 75786273697196134L; // 64 bits signed

        // Boolean
        boolean myBool = true;

        //// Floating Point:
        float myFloat = 0.498478F;  // 32 bit
        double myDouble = 549794654.8484;  // 64 bit

        //Character:
        char myChar = 'h';  //

        ///////////////////////
        // Numeric Literals:
        long creditCardNumber = 1234_5678_9012_3456L;
        long socialSecurityNumber = 999_99_9999L;
        long hexBytes = 0xFF_EC_DE_5E;
        long hexWords = 0xCAFE_BABE;
        long maxLong = 0x7fff_ffff_ffff_ffffL;
        byte nybbles = 0b0010_0101;
        long bytes = 0b11010010_01101001_10010100_10010010;

        // Rules for Literals:
        /*
            You can only place underscores between digits but can't place it:
            -- Beginning or end of number.
            -- Adjacent to decimal point in a floating point literal.
            -- Prior to an F or L suffix.
            -- In positions where a string of digits is expected.
         */

        // Java IS case-sensitive.
    }

}
