package ch5;

public class E_DeclaringLocalInstanceVariables {
}

class Lion {
    int hunger = 4;
    public int feedZooAnimals() {
        int snack = 10; // Local variable
        if(snack > 4) {
            long dinnerTime = snack++;
            hunger--;
        }
        return snack;
    }
}

//////////////////////////////////////////////////////////
// Local Variable Modifiers
class Animal {
    String name;
    public void setName(String name) {
        this.name = name;
    }
}
class LocalVariableModifiers {
    public void zooAnimalCheckup(boolean isWeekend) {
        final int rest;
        if(isWeekend) rest = 5; else rest = 20;
        System.out.print(rest);
        final var giraffe = new Animal();
        final int[] friends = new int[5];
//        rest = 10; // DOES NOT COMPILE
//        giraffe = new Animal(); // DOES NOT COMPILE
//        friends = null; // DOES NOT COMPILE
    }

    public void zooAnimalCheckup2(boolean isWeekend) {
        final int rest;
        if(isWeekend) rest = 5;
//        System.out.print(rest); // DOES NOT COMPILE
    }


    public void zooAnimalCheckup3() {
        final int rest = 5;
        final Animal giraffe = new Animal();
        final int[] friends = new int[5];
        giraffe.setName("George");
        friends[2] = 2;
    }
}