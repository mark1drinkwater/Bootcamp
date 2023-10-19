package ch7;

public class N_AnonymousClass {
}
// An anonymous class is a specialized form of a local class that does not have a name.
//It is declared and instantiated all in one statement using the new keyword, a type name with
//parentheses, and a set of braces {}. Anonymous classes must extend an existing class or
//implement an existing interface. They are useful when you have a short implementation that
//will not be used anywhere else.

class ZooGiftShop {
    public int admission(int basePrice) {
        // So we can't create instances of abstract classes right?
        // But it's okay because we provide the class body right here -- anonymously.
        SaleTodayOnly sale = new SaleTodayOnly() {
            int dollarsOff() {
                return 3;
            }
        }; // Don't forget the semicolon!
        return basePrice - sale.dollarsOff();
    }

    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////
// Same example instead implementing an interface instead of extending an abstract class:
class ZooGiftShop2 {
    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            public int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }

    interface SaleTodayOnly {
        int dollarsOff();
    }
}
///////////////////////////////////////////////////////
// You can even define anonymous classes outside a method body
class Gorilla {
    interface Climb {}
    Climb climbing = new Climb() {};
}