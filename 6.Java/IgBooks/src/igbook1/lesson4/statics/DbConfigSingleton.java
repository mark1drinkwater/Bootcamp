package igbook1.lesson4.statics;

public class DbConfigSingleton {
    private final String hostName;
    private final String dbName;
    // Lines omitted
    private static final DbConfigSingleton instance = new DbConfigSingleton();

    private DbConfigSingleton() {
        // Values loaded from a file in practice
        hostName = "dbhost.example.com";
        dbName = "employees";
        // Connect to db
    }

    public static DbConfigSingleton getinstance() {
        return instance;
    }
}
