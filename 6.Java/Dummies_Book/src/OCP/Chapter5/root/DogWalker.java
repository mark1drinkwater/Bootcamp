package root;

public class DogWalker {
    public static void main(String[] args) {
        walkDog(100);
        walkDog(1, 2);
        walkDog(1, 2, 3);
        walkDog(199, new int[] {4, 5, 6, 7, 8} );
        walkDog(1, null);
    }
    public static void walkDog(int start, int... steps) {
        System.out.println("Start is " + start);
        System.out.println("The length of steps is " + steps.length);
    }

}
