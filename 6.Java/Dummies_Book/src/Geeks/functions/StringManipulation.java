package Geeks.functions;

public class StringManipulation {
}

class Test3 {
    public static void main(String[] args) {
        String str = "geeks";
        str.toUpperCase();
        str += "forgeeks";
        // geeksforgeeks
        String string = str.substring(2, 13);
        string = string + str.charAt(4);
        System.out.println(string);

        f(2);

        int[] array = {13, 7, 27, 2, 18, 33, 9, 11, 22, 8};
        int[] p = new int[10];
        int[] q = new int[10];
        for (int k = 0; k < 10; k++) {
            p[k] = array[k];
            q = p;
            p[4] = 20;
        }
        System.out.println(array[4] + " : " + q[4]);

    }

    static int f(int n) {
        if (n <= 1) return 1;
        else if (n % 2 == 0) return f(n / 2);
        else return f(3 * n - 1);
    }
}

class First {
    public static int CBSE(int x) {
        if (x < 100) x = CBSE(x + 10);
        return (x - 1);
    }

    public static void main(String[] args) {
//        System.out.print(First.CBSE(60));
        demo(1234);
    }

    public static void demo(int x)
    {
        System.out.print(x % 10);
        if (x % 10 != 0) {
            demo(x / 10);
        }
        System.out.print(x % 10);
    }
}

//public class While {
//    public void loop() {
//        int x = 0;
//        while (1) {
//            System.out.println("x plus one is" + (x + 1));
//        }
//    }
//}