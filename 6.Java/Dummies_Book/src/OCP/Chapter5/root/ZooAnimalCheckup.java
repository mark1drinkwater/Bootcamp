package root;

public class ZooAnimalCheckup {
    public static void main(String[] args) {
        zooAnimalCheckup(true);
    }

    public static void zooAnimalCheckup(boolean isWeekend) {
        final int rest;
        // It's final but we're assigning a value to it for the first time.
        if (isWeekend) rest = 5;
        else rest = 20;
        System.out.println(rest);

        final var giraffe = new Animal();
        final int[] friends = new int[5];

        //rest = 10; // DOES NOT COMPILE
        //giraffe = new Animal(); // DOES NOT COMPILE
        //friends = null; // DOES NOT COMPILE

        // DOES COMPILE.
        friends[0] = 4;
        friends[1] = 2;
        friends[2] = -5;
        friends[3] = 15;
        friends[4] = 56;
    }

    public void zooAnimalCheckup() {
        final int rest = 5;
        final Animal giraffe = new Animal();
        final int[] friends = new int[5];
        giraffe.setName("George");
        friends[2] = 2;
    }

    public String zooFriends() {
        final String name = "Harry the Hippo";
        var size = 10;
        final boolean wet;

        if (size > 100) size++;
        name.substring(0);
        wet = true;
        return name;
    }


}

class Animal {
    String name;
    public void setName(String name) {
        this.name = name;
    }
}