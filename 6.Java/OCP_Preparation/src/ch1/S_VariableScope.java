package ch1;

public class S_VariableScope {
    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    }

    // Limiting Scope
    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        } // bitesOfCheese goes out of scope here
//        System.out.println(bitesOfCheese); // DOES NOT COMPILE
    }


    public void eatIfHungry2(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                var teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
//        System.out.println(teenyBit); // DOES NOT COMPILE
    }

    // Tracing scope
    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            var timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }
}

// Applying Scope to Classes
class Mouse {
    final static int MAX_LENGTH = 5;
    int length;

    public void grow(int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
        }
    }
}