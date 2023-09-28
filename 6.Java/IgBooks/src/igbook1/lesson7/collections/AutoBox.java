package igbook1.lesson7.collections;

public class AutoBox {
    public static void main(String[] args) {
        Integer intObject = new Integer(1);
        int intPrimitive = 2;

        Integer tempInteger;
        int tempPrimitive;

        tempInteger = new Integer(intPrimitive);
        tempPrimitive = intObject.intValue();

        tempInteger = intPrimitive; // Auto box
        tempPrimitive = intObject; // Auto unbox

        /*
            Autoboxing and unboxing are Java lang features that enable you to make sensible
            assignments without formal casting syntax.
            Be careful when using autoboxing in a loop as thee is a performance cost.
         */
    }
}
