package OCP.Chapter8.lambda;


interface LearnToSpeak {
    void speak(String sound);
}

class DuckHelper {
    public static void teacher(String name, LearnToSpeak trainer) {
        // Exercise patience (omitted)
        trainer.speak(name);
    }

    // A more direct way to do it.
//    public static void main(String[] args) {
//        DuckHelper.teacher("quack quack", s -> System.out.println(s) );
//    }
}

public class Duckling {
    public static void makeSound(String sound) {
        // This is how to do it, if you want to save your lambda to a variable.
        // Then have another class call it later.

        // Lambda expression
        LearnToSpeak learner1 = s -> System.out.println(s);
        // Method Lambda
        LearnToSpeak learnerLoud = s -> {
            System.out.println("I like to " + s);
            System.out.println("A lot!");
        };

        // Method reference
        LearnToSpeak learner2 = System.out::println;

        // A method reference and a lambda behave the same way at runtime.
        // You can pretend the compiler turns your method references into lambdas.

        DuckHelper.teacher(sound, learner1);
        DuckHelper.teacher(sound, learner2);
        DuckHelper.teacher(sound, learnerLoud);

        // A more direct way to do it:
        DuckHelper.teacher("quack quack", s -> System.out.println(s) );
        // or
        learner1.speak("chirp chirp");
    }

    public static void main(String[] args) {
        makeSound("Chick chick!");
    }
}