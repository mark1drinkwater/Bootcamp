package OCP.Chapter11.formatting;

import java.util.Locale;

public class D_InternalizationLocalization {
    public static void main(String[] args) {
        // Picking a Locale
        Locale locale = Locale.getDefault();
        System.out.println(locale);

        System.out.println(Locale.GERMAN);
        System.out.println(Locale.GERMANY);

        //
        System.out.println("\nConstructing a locale:");
        System.out.println(new Locale("fr"));
        System.out.println(new Locale("hi", "IN"));

        //
        System.out.println("\nLocale builder:");
        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();

        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();
        System.out.println(l1);
        System.out.println(l2);

        //
        System.out.println("\nChanging default Locale:");
        System.out.println(Locale.getDefault());
        Locale locale2  = new Locale("fr");
        Locale.setDefault(locale2);
        System.out.println(Locale.getDefault());
    }
}
