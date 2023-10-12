package ch5;

public class D_ExceptionMethodBody {
}

class ExceptionList {
    public void zeroExceptions() {}
    public void oneException() throws IllegalArgumentException {}
    public void twoExceptions() throws
            IllegalArgumentException, InterruptedException {}
}

class MethodBody {
        public void fly1() {}
//        public void fly2() // DOES NOT COMPILE
        public void fly3(int a) { int name = 5; }
}