package Challenges;

public class StairCase {

    public static void staircase1(int n) {
        // Write your code here
        String output = "";
        for (int i = 1; i <=n; i++) {
            String line = "";
            for (int j = 0; j < i; j++) {
                line += "#";
            }
            line = String.format("%" + n + "s", line);
            output += line + "\n";
        }
        System.out.print(output);
    }

    public static void staircase2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    static void staircase3(int n) {
        String str = "#";
        for (int i=0; i<n; i++) {
            System.out.printf("%"+n+"s\n", str);
            str += "#";
        }
    }

    public static void staircase4(int n) {
        String line = "#";
        for (int i = 0; i < n; i++) {
            System.out.printf("%" + n + "s" + "\n", line);
            line += "#";
        }
    }

    public static void main(String[] args) {
        staircase1(10);
    }

}
