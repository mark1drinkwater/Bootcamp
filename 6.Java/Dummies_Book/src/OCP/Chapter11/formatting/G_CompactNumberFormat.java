package OCP.Chapter11.formatting;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Stream;
import static java.text.NumberFormat.*;

public class G_CompactNumberFormat {
    public static void main(String[] args) {
        var formatters1 = Stream.of(
                getCompactNumberInstance(),  // 7M
                getCompactNumberInstance(Locale.getDefault(), Style.SHORT), //7M
                getCompactNumberInstance(Locale.getDefault(), Style.LONG), // 7 million
                getCompactNumberInstance(Locale.GERMAN, Style.SHORT), // 7 Mio.
                getCompactNumberInstance(Locale.GERMAN, Style.LONG), // 7 Millionen
                getNumberInstance()); // 7 123 456

        formatters1.map(s -> s.format(7_123_456)).forEach(System.out::println);

        var formatters2 = Stream.of(
                getCompactNumberInstance(),  // 315M
                getCompactNumberInstance(Locale.getDefault(), Style.SHORT), //315M
                getCompactNumberInstance(Locale.getDefault(), Style.LONG), // 315 million
                getCompactNumberInstance(Locale.GERMAN, Style.SHORT), // 315 Mio.
                getCompactNumberInstance(Locale.GERMAN, Style.LONG), // 315 Millionen
                getNumberInstance()); // 314 900 000

        System.out.println("\nAnother example:");
        formatters2.map(s -> s.format(314_900_000)).forEach(System.out::println);
    }
}
