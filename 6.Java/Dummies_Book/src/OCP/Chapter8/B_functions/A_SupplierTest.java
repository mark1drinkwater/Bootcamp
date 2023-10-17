package OCP.Chapter8.B_functions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class A_SupplierTest {
    public static void main(String[] args) {
        // Supplier is often used when constructing new objects.
        // Supplier takes no parameters but returns a object.
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);
        System.out.println(d2);

        Supplier<StringBuilder> sb1 = StringBuilder::new;
        Supplier<StringBuilder> sb2 = () -> new StringBuilder();

        System.out.println(sb1.get().append("Hello"));
        System.out.println(sb2.get().append(" World"));


        // The double <> makes it a bit more confusing
        // But simply put we're creating an ArrayList of type String.
        Supplier<ArrayList<String>> s3 = ArrayList::new;
        ArrayList<String> a1 = s3.get();
        System.out.println(a1); // []
    }
}
