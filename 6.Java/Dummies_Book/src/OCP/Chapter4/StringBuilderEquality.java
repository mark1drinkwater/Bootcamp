package OCP.Chapter4;

public class StringBuilderEquality {
    public static void main(String[] args) {
        // Understanding Equality:
//        var one = new StringBuilder("ab");
//        var two = new StringBuilder("ab");
//        var three = one.append("a");
//
//        System.out.println(one == two);
//        System.out.println(one == three);

        var x = "Hello World";
        var z = "   Hello World".trim();
        System.out.println(x.equals(z));
        System.out.println(x==z);
    }
}
