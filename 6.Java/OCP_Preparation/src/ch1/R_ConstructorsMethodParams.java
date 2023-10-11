package ch1;

public class R_ConstructorsMethodParams {
    public void findAnswer(boolean check) {}

    public void checkAnswer() {
        boolean value;
//        findAnswer(value); // DOES NOT COMPILE
    }
}

////////////////////////////////////////////////////
// Inferring the Type with var
class Zoo4 {
    public void whatTypeAmI() {
        var name = "String";
        var size = 7;
    }
}

// The formal name of var:
// Is Local Variable Type Inference
// That means you can only use this feature for local variables...

class VarKeyword {
//    var tricky = "Hello"; // DOES NOT COMPILE

    public void reassignment() {
        var number = 7;
        number = 4;
//      number = "five"; // DOES NOT COMPILE
    }

    // Examples with var
    public void doesThisCompile(boolean check) {
//        var question;
//        question = 1;
//        var answer;
//        if (check) {
//            answer = 2;
//        } else {
//            answer = 3;
//        }
//        System.out.println(answer);
    }

    // Cant use int and var
    // Can't assign var as null.
    public void twoTypes() {
//        int a, var b = 3; // DOES NOT COMPILE
//        var n = null; // DOES NOT COMPILE
    }

    // Cant use it in method parans
//    public int addition(var a, var b) { // DOES NOT COMPILE
//        return a + b;
//    }

}

// Var is not a reserved word.
class Var {
    public void var() {
        var var = "var";
    }
    public void Var() {
        Var var = new Var();
    }
}