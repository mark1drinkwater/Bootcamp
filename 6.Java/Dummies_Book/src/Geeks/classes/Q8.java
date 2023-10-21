package Geeks.classes;

public class Q8 {
}

class Test2 {
    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.start();
    }

    void start() {
        String stra = "do";
        String strb = method(stra);
        System.out.print(": " + stra + strb);
    }

    String method(String stra) {
        stra = stra + "good";
        System.out.print(stra);
        return "good";
    }
}