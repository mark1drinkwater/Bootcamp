package OCP.Chapter5.root.statics;

public class Dog {
    public static void main(String[] args) {
        String name = "Webby";
        speak(name);
        System.out.println(name);

        StringBuilder name2 = new StringBuilder("Webby");
        speak(name2);
        System.out.println(name2);
    }

    public static void speak(String n) {
        n = "Georgette";
    }

    public static void speak(StringBuilder s) {
        s.append("Georgette");
    }

}
