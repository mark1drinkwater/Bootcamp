package igbook1.lesson4.statics;

public class SingletonClass {
    private static final SingletonClass instance = new SingletonClass();
    private SingletonClass() {}
    public static SingletonClass getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();

        if (s1 == s2) {
            System.out.println("They are the same");
        }
    }

    // A singleton is a class for which only once instance can be created and it provides a global point of access to this instance.
    // Singletons are useful to provide a unique source of data or functionality to other Objects.

    // How to implement a singleton design pattern:
    /*
        1. Use a static reference to point to the single instance.
        Making the reference final ensures it will never reference a different instance.
        2. Add a single private constructor to the singleton class. Which prohibits any attempts to instantiate the singleton class using new.
        3. A public factory method returns a copy of the singleton reference. This method is declared static to access the static field declared in step 1.
        Step 1 could use a public variable, eliminating the need for the factory method.
        Factory methods provide greater flexibility (e.g. implement a per-thread singleton solution).
        4. A singleton pattern restricts the creation of a instance until requested the first time (Lazy initialization).
     */
}
