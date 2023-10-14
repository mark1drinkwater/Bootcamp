package OCP.Chapter11.formatting;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class F_ParseNumbers {
    public static void main(String[] args) {
        String s = "40.45";

        var en = NumberFormat.getInstance(Locale.US);
        try {
            System.out.println(en.parse(s));
        } catch (ParseException e) {
            System.out.println("Unable to parse.");
        }

        var fr = NumberFormat.getInstance(Locale.FRANCE);
        try {
            System.out.println(fr.parse(s));
        } catch (ParseException e) {
            System.out.println("Unable to parse.");
        }

        // Parsing Currency
        String income = "$92,807.99";
        var cf = NumberFormat.getCurrencyInstance(Locale.US);
        try {
            double value = (Double) cf.parse(income);
            System.out.println(value);
        } catch (ParseException e) {
            System.out.println("Unable to parse." + e);
        }
    }
}
