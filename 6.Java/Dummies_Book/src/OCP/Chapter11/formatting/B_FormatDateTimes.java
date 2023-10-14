package OCP.Chapter11.formatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class B_FormatDateTimes {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2022, Month.OCTOBER, 20);
        System.out.println(date.getDayOfWeek()); // THURSDAY
        System.out.println(date.getMonth()); // OCTOBER
        System.out.println(date.getYear()); // 2022
        System.out.println(date.getDayOfYear()); // 293

        // Using the DateTimeFormatter
        System.out.println("\nDateTimeFormatter:");

        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dt = LocalDateTime.of(date, time);

        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        // The DateTimeFormatter will throw an exception if it encounters an incompatible type.
//        date.format(DateTimeFormatter.ISO_LOCAL_TIME);  // RuntimeException
//        time.format(DateTimeFormatter.ISO_DATE);  // RuntimeException


        ////////////////////////////////
        // Customising the Date/Time Format
        var f = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' hh:mm");
        System.out.println(dt.format(f));
    }
}
