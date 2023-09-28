package igbook1.lesson7.caching;

public class CacheString {
    // If we wanted to cache another data type.
    // We would need a totally different class.
    private String message;
    public void add(String message) {
        this.message = message;
    }

    public String get() {
        return this.message;
    }
}
