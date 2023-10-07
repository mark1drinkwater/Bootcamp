package OCP.Chapter8.lambda;

interface EmptyStringCreator {
    String create();
}

public class ConstructorMethodReference {
    public static void main(String[] args) {
        EmptyStringCreator methodRef1 = String::new;
        EmptyStringCreator lambda1 = () -> new String();

        // We create a empty string.
        String myString = methodRef1.create();

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
        ConstructorMethodReference.main(null);


        StringCopier methodRef = String::new;
        StringCopier lambda = s -> new String(s);

        System.out.println(methodRef.copy("To infinity and beyond!"));
    }
}