package igbook1.lesson2;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("string sb: " + sb);
        sb.append(" world");

        System.out.println("string sb: " + sb);

        sb.append("!").append(" are").append(" you?");
        System.out.println("string sb: " + sb);

        sb.insert(12, " How");
        System.out.println("string sb: " + sb);

        // Get length
        System.out.println("Length: " + sb.length() );

        // Get SubString
        System.out.println("Sub: " + sb.substring(0, 5) );


        // StringBuilder objects are like String objects except they may be modified.
        // It's used when dealing with larger strings or modifying strings often.
    }
}
