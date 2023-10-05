package igbook1.lesson2;

public class WhileTest {
    public static void main(String[] args) {
        int x= 10;
        while (x < 20) {
            System.out.print("Value of x: " + x);
            x++;
            System.out.print("\n");
        }

        // Do while will always execute at least once!
        do  {
            System.out.println("Do While!");
        } while (x < 20);

    }
}
