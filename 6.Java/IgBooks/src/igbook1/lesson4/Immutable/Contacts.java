package igbook1.lesson4.Immutable;

/*
    Rules to create a immutable class in Java:
    1. State of immutable object can't be modified after construction.
    2. Declare a class final so it can't be extended.
    3. All fields are declared private so that direct access is not allowed.
    4. Setter methods are not provided for variables.
    5. All fields of immutable class should be final.
    6. All the fields are initialized via a constructor.
    7. Object should be final in order to restrict subclass from alttering ummtability of patent
 */

/*
    Benefits of immutable classes in Java:
    1. Immutable objects are by default thread-safe & can be shared without synchronization in concurrent environment.
    2. Immutable object boosts performance of Java applications by reducing synchronizaation in code.
    3. Reusability, you can cache immutable objects and re-use them much like String literals and Integers.

 */

public final class Contacts {
    private final String firstName;
    private final String lastName;

    public Contacts(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " - " + lastName;
    }
}
