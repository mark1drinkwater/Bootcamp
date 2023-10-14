package OCP.Chapter11.formatting;

import java.text.NumberFormat;
import java.util.Locale;

public class E_LocalizingNumbers {
    public static void main(String[] args) {
        // Formatting Numbers
        System.out.println("\nFormatting Numbers");
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;

        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));

        var gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(attendeesPerMonth));

        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth));

        System.out.println("\nFormatting Currency:");
        double price = 48;
        var myLocale = NumberFormat.getCurrencyInstance();
        var grCurrency = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        var caCurrency = NumberFormat.getCurrencyInstance(Locale.CANADA);
        System.out.println(myLocale.format(price));
        System.out.println(grCurrency.format(price));
        System.out.println(caCurrency.format(price));

        //////////////////////////////
        System.out.println("\nFormatting percentages");
        double successRate = 0.802;
        var usPercent = NumberFormat.getPercentInstance(Locale.US);
        System.out.println(usPercent.format(successRate));
        var grPercent = NumberFormat.getPercentInstance(Locale.GERMANY);
        System.out.println(grPercent.format(successRate));
    }
}

