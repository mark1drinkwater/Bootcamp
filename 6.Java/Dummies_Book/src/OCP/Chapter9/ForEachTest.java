package OCP.Chapter9;

import java.util.Collection;
import java.util.List;

public class ForEachTest {
    public static void main(String[] args) {
        Collection<String> cats = List.of("Annie", "Ripley");
        // Uses a consumer
        cats.forEach(System.out::println);
        cats.forEach(c -> System.out.println(c));
    }
}
