package OCP.Chapter4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManipulateTime {
    public static void main(String[] args) {
        var date = LocalDate.of(2022, Month.JANUARY, 20);
        System.out.println(date); // 2022–01–20

        date = date.plusDays(2);
        System.out.println(date); // 2022–01–22
        date = date.plusWeeks(1);
        System.out.println(date); // 2022–01–29
        date = date.plusMonths(1);
        System.out.println(date); // 2022–02–28
        date = date.plusYears(5);
        System.out.println(date); // 2027–02–28

        var date2 = LocalDate.of(2024, Month.JANUARY, 20);
        var time = LocalTime.of(5, 15);
        var dateTime = LocalDateTime.of(date2, time);
        System.out.println(dateTime); // 2024–01–20T05:15
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); // 2024–01–19T05:15
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2024–01–18T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2024–01–18T19:14:30

        var dateTime2 = LocalDateTime.of(date, time).minusDays(1).minusHours(10).minusSeconds(30);

        var date3 = LocalDate.of(2024, Month.JANUARY, 20);
        var date4 = date3.plusDays(10);
        System.out.println(date4);

        var date5 = LocalDate.of(2024, Month.JANUARY, 20);
//        date5 = date5.plusMinutes(1); // DOES NOT COMPILE

    }
}
