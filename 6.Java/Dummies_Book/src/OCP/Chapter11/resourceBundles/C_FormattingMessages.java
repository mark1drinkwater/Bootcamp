package OCP.Chapter11.resourceBundles;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class C_FormattingMessages {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle rb = ResourceBundle.getBundle("ZooVariables");

        String format = rb.getString("helloByName");
        System.out.print(MessageFormat.format(format, "Tammy", "Henry"));
    }
}

class ZooOptions {
    public static void main(String[] args) {
        var props = new Properties();
        props.setProperty("name", "Our zoo");
        props.setProperty("open", "10am");

        System.out.println(props.getProperty("camel")); // null
        System.out.println(props.getProperty("camel", "Bob")); // Bob
        System.out.println(props.get("open"));; // 10am
//        props.get("open", "The zoo will be open soon"); // DOES NOT COMPILE
    }
}