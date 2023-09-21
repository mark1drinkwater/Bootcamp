package OCP.Chapter4;

public class Concatenation
{

    public static void main(String[] args) {
        System.out.println(1 + 2); // 3
        System.out.println("a" + "b"); // ab
        System.out.println("a" + "b" + 3); // ab3
        System.out.println(1 + 2 + "c"); // 3c
        System.out.println("c" + 1 + 2); // c12
        System.out.println("c" + (1 + 2)); // c12
        System.out.println("c" + null); // cnull



        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);

        var s = "1"; // s currently holds "1"
        // s = s + "2";
        s += "2"; // s currently holds "12"
        s += 3; // s currently holds "123"
        System.out.println(s); // 123

//        var t = 1;
//        t += 2;
//        t += "3";
//        System.out.println(t);

        // String length:
        var name = "animals";
        System.out.println(name.length()); // 7

        System.out.println("\nChar at");

        var name2 = "animals";
        System.out.println(name2.charAt(0)); // a
        System.out.println(name2.charAt(6)); // s
//        System.out.println(name2.charAt(7)); // exception

        System.out.println("\nindexOf");

        System.out.println(name.indexOf('a')); // 0
        System.out.println(name.indexOf("al")); // 4
        System.out.println(name.indexOf('a', 4)); // 4
        System.out.println(name.indexOf("al", 5)); // -1

        // Whitespace
        String whitespace1 = "  abc  ";
        String whitespace2 = " \n \t";

        // Strip
        System.out.println("  abc  ");
        System.out.println("  abc  ".strip()); // abc
        System.out.println("\t a b c\n");
        System.out.println("\t a b c\n\r".strip()); // a b c

        String text = " abc\t ";
        System.out.println(text.trim().length()); // 3
        System.out.println(text.strip().length()); // 3
        System.out.println(text.stripLeading().length()); // 5
        System.out.println(text.stripTrailing().length());// 4

    }

}
