package OCP.Chapter11.resourceBundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class A_LoadingProperties {
    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        Locale englishCanada = new Locale("en", "CA");
        Locale frenchCanada = new Locale("fr", "CA");

        System.out.println("Greetings in English from US & French from France");
        printWelcomeMessage(us);
        printWelcomeMessage(france);
        System.out.println("\nGreeting in English from Canada & French from Canada");
        printWelcomeMessage(englishCanada);
        printWelcomeMessage(frenchCanada);

        System.out.println("\nResource Bundles Keys & Values");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", us);
        rb.keySet().stream()
                .map(k -> k + ": " + rb.getString(k))
                .forEach(System.out::println);
    }

    public static void printWelcomeMessage(Locale locale) {
        var rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello")
            + ", " + rb.getString("open"));

    }
}
