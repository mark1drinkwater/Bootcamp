package OCP.Chapter11.formatting;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class C_CustomiseDateTimeFormat {
    public static void main(String[] args) {
        System.out.println("Formatting Dates and Times:");
        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);

        var formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        System.out.println(dt.format(formatter1)); // 10/20/2022 06:15:30

        var formatter2 = DateTimeFormatter.ofPattern("MM_yyyy_-_dd");
        System.out.println(dt.format(formatter2)); // 10_2022_-_20

        var formatter3 = DateTimeFormatter.ofPattern("h:mm z");
//         System.out.println(dt.format(formatter3)); // DateTimeException

        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        // Selecting a format() Method:
        System.out.println("\nSelecting a format() Method");
        var dateTime = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
        var formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        System.out.println(dateTime.format(formatter)); // 10/20/2022 06:15:30
        System.out.println(formatter.format(dateTime)); // 10/20/2022 06:15:30

        /////////////////////////////////////////////////////////////////////////////
        // Adding Custom Text Values:
        System.out.println("\nAdding Custom Text Values");
        var dt3 = LocalDateTime.of(2022, Month.OCTOBER, 20, 6, 15, 30);
        var f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy ");
        var f2 = DateTimeFormatter.ofPattern(" hh:mm");
        System.out.println(dt.format(f1) + "at" + dt3.format(f2));

        // Escape Text
        System.out.println("\nEscape Text");
        var f3 = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(dt.format(f3));

        // Show single quotes
        System.out.println("\nShowing Single Quotes");
        var g1 = DateTimeFormatter.ofPattern("MMMM dd', Party''s at' hh:mm");
        System.out.println(dt.format(g1));

        var g2 = DateTimeFormatter.ofPattern("'System format, hh:mm: 'hh:mm");
        System.out.println(dt.format(g2));

        var g3 = DateTimeFormatter.ofPattern("'NEW! 'yyyy', yay!'");
        System.out.println(dt.format(g3));

//        DateTimeFormatter.ofPattern("The time is hh:mm");  // Exception thrown
//        DateTimeFormatter.ofPattern("'The time is: hh:mm: ");  // Exception thrown
    }
}
