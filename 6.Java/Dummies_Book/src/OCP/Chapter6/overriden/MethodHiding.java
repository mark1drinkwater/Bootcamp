package OCP.Chapter6.overriden;

public class MethodHiding {
}

class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }
}

class Panda extends Bear {
//    public static void eat() {
//        System.out.println("Panda is chewing");
//    }

    public static void main(String[] args) {
        eat();
    }
}