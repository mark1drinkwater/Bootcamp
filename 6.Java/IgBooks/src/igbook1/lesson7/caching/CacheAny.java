package igbook1.lesson7.caching;

// T stands for "type" and can represent any type.

/*
    You can use any identifier you want.
    The following values are merely strongly suggested:
    T for Type
    E for Element
    K for Key
    V for Value
    S, U: Used if there are 2nd, 3rd types or more.
 */
public class CacheAny<T> {
    private T t;
    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }

    public static void main(String[] args) {
        CacheString myMessage = new CacheString();

        // Generics
        CacheAny<String> myGenericMessage = new CacheAny<>();

        myMessage.add("Save this for me."); // Type
        myGenericMessage.add("Save this for me."); // Generic

        // Notice how generic add() & get() functions works exactly the same.
        System.out.println(myMessage.get());
        System.out.println(myGenericMessage.get());

        CacheAny<Integer> myGenericInt = new CacheAny<>();
        myGenericInt.add(5);
        System.out.println(myGenericInt.get());
    }

}
