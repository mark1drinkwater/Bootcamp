package OCP.Chapter4;

public class StringBuilderTest
{

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = "start+middle"

        System.out.println(sb);

        StringBuilder same = sb.append("+end"); // "start+middle+end"
        // Refers to the same reference in both sb and same
        System.out.println(sb);
        System.out.println(same);

        var sb1 = new StringBuilder("animals");
        String sub = sb1.substring(sb1.indexOf("a"), sb1.indexOf("al"));
        int len = sb1.length();
        char ch = sb1.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

        var sb2 = new StringBuilder().append(1).append('c');
        sb2.append("-").append(true);
        System.out.println(sb2); // 1c-true

        // Inserting
        System.out.println("\n Inserting:");

        var sb3 = new StringBuilder("animals");
        sb3.insert(7, "-");
        System.out.println(sb3);
        sb3.insert(0, "-");
        System.out.println(sb3);
        sb3.insert(4, "-");
        System.out.println(sb3);

        // Deleting Contents:
        var sb4 = new StringBuilder("abcdef");
        sb4.delete(1, 3);  // sb = adef
        // sb4.deleteCharAt(5);  // exception
        System.out.println(sb4);

        var sb5 = new StringBuilder("abcde");
        sb5.delete(3, 6);
        System.out.println(sb5);

        var sb6 = new StringBuilder("pigeon dirty");
        System.out.println(sb6);
        sb6.replace(3, 6, "sty");
        System.out.println(sb6);

        var sb7 = new StringBuilder("pigeon dirty");
        sb7.replace(3, 100, "");
        System.out.println(sb7);

        // Reversing
//        var sb8 = new StringBuilder("ABC");
//        sb8.reverse();
//        System.out.println(sb8);
//
//        // Understanding Equality:
//        var one = new StringBuilder();
//        var two = new StringBuilder();
//        var three = one.append("a");
//        System.out.println(one == two);
//        System.out.println(one == three);

        var x = "Hello World";
        var z = "Hello World";
        System.out.println(x.equals(z));
        System.out.println(x==z);

        // That's strange, the authors of StringBuilder did not implement equals().
        // .equals() will check reference equality.
        // Instead call .toString() then .equals()

        var name = "a";
        var sb9 = new StringBuilder("a");
//        System.out.println(name == sb9); // DOES NOT COMPILE
        // Remember that == checks for object reference equality.
        // The compiler is smart enough to know that 2 reference can't possibly point to the same object when they are completely different types.

        var x1 = "Hello World";
        var y1 = "Hello World";
        System.out.println(x1 == y1);  // true

        var x2 = "Hello World";
        var z2 = " Hello World".trim();
        System.out.println(x2 == z2);  // false
        // Although they have the same value at the end.
        // One is computed at runtime, since it isn't the same at compile-time a new String object is created.

        var singleString = "hello";
        var concat = "hello ";
        concat += "world";
        System.out.println(singleString == concat); // false

        var x3 = "Hello World";
        var y3 = new String("Hello World");
        System.out.println(x3 == y3); // false

        // Interns!
        var myName = "Hello World";
        var myName2 = new String("Hello World").intern();
        System.out.println(myName == myName2); // true
        // First we tell Java to use the string pool normally for name,
        // Then for name2 we tell Java to create a new object using the constructor but to intern it and use the string pool anyway.
        // Since both variables point to the same reference in the string pool, we can use the == operator.

        System.out.println("\nRat testing:");

        var first = "rat" + 1;
        var second = "r" + "a" + "t" + "1";
        var third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second);
        System.out.println(first == second.intern());
        System.out.println(first == third);
        System.out.println(first == third.intern());


    }

}
