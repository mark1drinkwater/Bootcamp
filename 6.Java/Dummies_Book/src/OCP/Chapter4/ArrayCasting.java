package OCP.Chapter4;

public class ArrayCasting
{
    public static void main(String[] args) {
//        String[] strings = { "stringValue" };
//        Object[] objects = new Object[1];
//        objects = strings;
//        //String[] againStrings = (String[]) objects;
//        //againStrings[0] = new StringBuilder("hello").toString(); // DOES NOT COMPILE
//        objects[0] = new StringBuilder();

        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length); // 3
//        System.out.println(mammals.length() );
        System.out.println(mammals[0]); // monkey
        System.out.println(mammals[1]); // chimp
        System.out.println(mammals[2]); // donkey

        var numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5;
            System.out.println(numbers[i]);
        }
        // 0 1 2 3 4 5 6 7 8 9
        System.out.println(numbers[numbers.length - 1]);

        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 5;


    }
}
