package ch1;
public class K_CreatingObjects {
}

class Park {

}

class Chick {
    public Chick() {
        System.out.println("In the constructor! Busy constructing 👷‍♂️👷‍♀️");
    }
    // public void Chick() {}  NOT A CONSTRUCTOR
}

class TestCode {
    public static void main(String[] args) {
        Park p = new Park();
    }
}