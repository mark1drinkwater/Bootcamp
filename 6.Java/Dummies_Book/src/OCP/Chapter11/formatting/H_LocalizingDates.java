package OCP.Chapter11.formatting;

// NB: Static import used here
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import static java.time.format.DateTimeFormatter.*;

import static java.time.format.FormatStyle.SHORT;

public class H_LocalizingDates {
    public static void print(DateTimeFormatter dtf, LocalDateTime dateTime, Locale locale) {
        System.out.println(dtf.format(dateTime) + " --- " + dtf.withLocale(locale).format(dateTime));
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        var italy = new Locale("it", "IT");
        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 15, 12,34);

        // 10/20/22 --- 20/10/22
        print(ofLocalizedDate(SHORT), dt, italy);

        // 3:12 PM --- 15:12
        print(ofLocalizedTime(SHORT), dt, italy);

        // 10/20/22, 3:12 PM --- 20/10/22, 15:12
        print(ofLocalizedDateTime(SHORT, SHORT), dt, italy);
    }

}
