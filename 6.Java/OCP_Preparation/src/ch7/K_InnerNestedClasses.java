package ch7;

public class K_InnerNestedClasses {
}

/*
A nested class is a class that is defined within another class. A nested class can come in one
of four flavors.
■ Inner class: A non-static type defined at the member level of a class
■ Static nested class: A static type defined at the member level of a class
■ Local class: A class defined within a method body
■ Anonymous class: A special case of a local class that does not have a name
 */

////////////////////////////////////////////////////////////////
// Inner Class:
/*
Inner classes have the following properties:
■ Can be declared public, protected, package, or private
■ Can extend a class and implement interfaces
■ Can be marked abstract or final
■ Can access members of the outer class, including private members
 */
//Ready for a complicated way to print Hi three times?
class Home {
    private final String greeting = "Hi"; // Outer class instance variable

    public static void main(String[] args) {
        var home = new Home(); // Create the outer class instance
        home.enterRoom();
    }

    public void enterRoom() { // Instance method in outer class
        var room = new Room(); // Create the inner class instance
        room.enter();
    }

    protected class Room { // Inner class declaration
        public int repeat = 3;

        /*
        Eagle-eyed readers may have noticed that we included a static method
        Previously, only static nested classes were allowed to include static methods. With the introduction of
        records in Java 16, the existing rule that prevented an inner class from having any static
        members (other than static constants) was removed. All four types of nested classes can
        now define static variables and methods!
         */
        private static void greet(String message) {
            System.out.println(message);
        }

        // Instantiating an Instance of an Inner Class
        public static void main(String[] args) {
            // We need an instance of Home to create room
            // We can't just call Home.new Room() because Java won't know which instance of Home it is associated with.
            var home = new Home();
            Room room = home.new Room(); // Create the inner class instance
            room.enter();
            // In a single line!
            new Home().new Room().enter(); // Sorry, it looks ugly to us too!
        }

        public void enter() {
            for (int i = 0; i < repeat; i++) greet(greeting);
        }
    }
}

/////////////////////////////////////////////////////////////////
/// Multiple inner classes. Cringe code 😖
class A {
    private int x = 10;

    class B {
        private int x = 20;

        class C {
            private int x = 30;

            public void allTheX() {
                System.out.println(x); // 30
                System.out.println(this.x); // 30
                System.out.println(B.this.x); // 20
                System.out.println(A.this.x); // 10
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.allTheX();
    }
}