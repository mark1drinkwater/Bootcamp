package OCP.Chapter8.lambda;

//////////////////////////////////////////////////
// Calling Instance Methods on a Particular Object
interface StringStart {
    boolean beginningCheck(String prefix);
}

interface StringChecker {
    boolean check();
}

public class CallingInstanceMethods {
    public static void main(String[] args) {
        var str = "Zoo";
        // str is our string variable, and we're calling the startsWith method on it.
        StringStart methodRef = str::startsWith;
        StringStart lambda = s -> str.startsWith(s);

        System.out.println(methodRef.beginningCheck("A")); // false
        System.out.println(lambda.beginningCheck("Z")); // false

        String st2 = "";
        StringChecker sc = st2::isEmpty;
        System.out.println(sc.check());

    }
}

//////////////////////////////////////////////////////////////////////
// Calling Instance Methods on a Parameter
interface StringParameterCheck {
    boolean check(String text);
}

class StringParamterCheckTest {
    public static void main(String[] args) {
        // isEmpty is Not a static method. It is an instance method. 🤔
        StringParameterCheck methodRef = String::isEmpty;
        StringParameterCheck lambda = s -> s.isEmpty();


        System.out.println(methodRef.check("\nZoo"));
        System.out.println(lambda.check("Zoo"));
    }
}

////////////////////////////////////////////////////////////////////
// Calling 2 parameters:
interface StringTwoParameterChecker {
    boolean check(String text, String prefix);
}

class StringTwoParameterCheckerTest {
    public static void main(String[] args) {
        // Java sees the functional interface has 2 parameters
        // And the compiler is smart enough to ALWAYS map the first parameter as the instance variable
        // and the 2nd parameter as the method argument.
        StringTwoParameterChecker methodRef = String::startsWith;
        StringTwoParameterChecker lambda = (s, p) -> s.startsWith(p);

        System.out.println("String 2 Parameter Checker:");
        System.out.println(methodRef.check("Zoo World", "zoo"));
        System.out.println(lambda.check("Hot Potato", "Hot"));
        System.out.println(lambda.check("Hot Potato", "Not"));
    }
}