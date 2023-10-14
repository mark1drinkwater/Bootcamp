package OCP.Chapter11.exceptions;

public class E_OverridingMethodsWithExceptions {}

class CanNotHopException extends Exception {}

class Hopper1 {
    public void hop() {}
}

class Bunny1 extends Hopper1 {
    // DOES NOT COMPILE
    // The super class does not throws any Exception so the subclass cannot throw any Exception either.
//    public void hop() throws CanNotHopException {}
}

// ============================================================================================================
class Hopper2 {
    public void hop() throws CanNotHopException {}
}

class Bunny2 extends Hopper2 {
    public void hope() {} // This is fine
}