package OCP.Chapter11.resourceBundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class B_SelectingResourceBundleValues {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Locale locale = new Locale("en", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);

        System.out.print(rb.getString("hello"));
        System.out.print(". ");
        System.out.print(rb.getString("name"));
        System.out.print(" ");
        System.out.print(rb.getString("open"));
        System.out.print(" ");
        System.out.print(rb.getString("visitors"));

    }
}
