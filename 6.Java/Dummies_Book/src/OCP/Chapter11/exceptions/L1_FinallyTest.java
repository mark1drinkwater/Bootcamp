package OCP.Chapter11.exceptions;

public class L1_FinallyTest {
    public static void main(String[] args) {
        L1_FinallyTest fTest = new L1_FinallyTest();
        fTest.exploreAnimals();
    }
    void exploreAnimals() {
        try {
            seeAnimals();
//            fall();
        } catch (Exception e) {
            getHugsFromDaddy();
        } finally {
            System.out.println("I see a 🐼");
        }
    }

    void seeAnimals() {
        System.out.println("I spot a giraffe! 🦒");
    }
    void getHugsFromDaddy() {
        System.out.println("Here's a hug 🤗");
    }
    void fall() {
        throw new RuntimeException();
    }
}
