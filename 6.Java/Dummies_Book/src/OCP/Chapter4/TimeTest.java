package OCP.Chapter4;

import java.time.*;

public class TimeTest {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        var date1 = LocalDate.of(2022, Month.JANUARY, 20);
        var date2 = LocalDate.of(2022, 1, 20);

        var time1 = LocalTime.of(6, 15); // hour and minute
        var time2 = LocalTime.of(6, 15, 30); // + seconds
        var time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

        System.out.println(time3);

        var dateTime1 = LocalDateTime.of(2022, Month.JANUARY, 20, 6, 15, 30);
        var dateTime2 = LocalDateTime.of(date1, time1);

        System.out.println(dateTime1);
        System.out.println(dateTime2);

        var zone = ZoneId.of("US/Eastern");
        var zoned1 = ZonedDateTime.of(2022, 1, 20,
                6, 15, 30, 200, zone);
        var zoned2 = ZonedDateTime.of(date1, time1, zone);
        var zoned3 = ZonedDateTime.of(dateTime1, zone);

        System.out.println(zoned1);
        System.out.println(zoned2);
        System.out.println(zoned3);

        var d = LocalDate.of(2022, Month.JANUARY, 32);
    }
}
