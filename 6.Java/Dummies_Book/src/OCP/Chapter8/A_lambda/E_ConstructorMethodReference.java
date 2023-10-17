package OCP.Chapter8.A_lambda;

interface EmptyStringCreator {
    String create();
}

public class E_ConstructorMethodReference {
    public static void main(String[] args) {
        // To create a new object you still use the new keyword for both method reference & lambda.
        EmptyStringCreator methodRef1 = String::new;
        EmptyStringCreator lambda1 = () -> new String();

        // We create an empty string.
        String myString = methodRef1.create();
        // Is our blank string equal to Snake? false
        System.out.println(myString.equals("Snake"));
    }
}

//////////////////////////////////////////////////////////
// Constructor with a parameter
interface StringCopier {
    String copy(String value);
}

class StringCopierTest {
    public static void main(String[] args) {
        // How to pass a parameter using methodRef & lambda.
        StringCopier methodRef = String::new;
        StringCopier lambda = s -> new String(s);
        //
        System.out.println(methodRef.copy("To infinity and beyond!"));
    }
}