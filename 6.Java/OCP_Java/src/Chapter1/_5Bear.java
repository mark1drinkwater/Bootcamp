package Chapter1;

public class _5Bear {

    /*
    Which statements about the following program are correct? (Choose all that apply.)
    A. The object created on line 9 is eligible for garbage collection after line 13.
    B. The object created on line 9 is eligible for garbage collection after line 14.
    C. The object created on line 10 is eligible for garbage collection after line 12.
    D. The object created on line 10 is eligible for garbage collection after line 13.
    E. Garbage collection is guaranteed to run.
    F. Garbage collection might or might not run.
    G. The code does not compile.
     */

    private _5Bear panda5Bear;

    private void roar(_5Bear b) {
        System.out.println("Roar!");
        panda5Bear = b;
    }

    public static void main(String[] args) {
        _5Bear brown5Bear = new _5Bear();
        _5Bear polar5Bear = new _5Bear();
        brown5Bear.roar(polar5Bear);
        polar5Bear = null;
        brown5Bear = null;
        System.gc();
    }

}