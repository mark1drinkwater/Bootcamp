package ch1;

public class P_IdentifyingIdentifiers {
    public static void main(String[] args) {
        long okidentifier;
        float $OK2Identifier;
        boolean _alsoOK1d3ntifi3r;
        char __SStillOkbutKnotsonice$;

//        These examples are not legal:
//        int 3DPointClass; // identifiers cannot begin with a number
//        byte hollywood@vine; // @ is not a letter, digit, $ or _
        String $coffee; // * is not a letter, digit, $ or _
        double Public; // public is a reserved word
        short _u; // a single underscore is not allowed

        /////////////////////////////////////////////////
        /// Declaring Multiple Variables
        /////////////////////////////////////////////////
        String s1, s2;
        String s3 = "yes", s4 = "no";
        int i1, i2, i3 = 50;

//        int num, String value; // DOES NOT COMPILE
//        This code doesn’t compile because it tries to declare multiple variables of different types
//        in the same statement.

        boolean b1, b2;
        String x1 = "1", x2;
//        double d1, double d2;
        int g1; int g2;
//        int r3; r4;
    }
}

