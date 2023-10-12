package ch5;

public class O_PassDataMethods {
    public static void main(String[] args) {
        int num = 4;
        newNumber(num);
        System.out.print(num); // 4
    }
    public static void newNumber(int num) {
        num = 8;
    }
}

/////////////////////////////////////////////////
// Passing Objects
class Dog1 {
    public static void main(String[] args) {
        String name = "Webby";
        speak(name);
        System.out.print(name);
    }
    public static void speak(String name) {
        name = "Georgette";
    }
}

///////////////////////////////////////////////
class Dog2 {
    public static void main(String[] args) {
        var name = new StringBuilder("Webby");
        speak(name);
        System.out.print(name); // WebbyGeorgette
    }
    public static void speak(StringBuilder s) {
        s.append("Georgette");
    }
}

class Dog3 {
    public static void main(String[] args) {
        int original1 = 1;
        int original2 = 2;
        swap(original1, original2);
        System.out.println(original1); // 1
        System.out.println(original2); // 2
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}