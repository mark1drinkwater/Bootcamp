package OCP.Chapter10.advancedStreams;

import java.util.Optional;

public class OptionalConfusion {
    public Optional<Integer> optIntGenerator(Optional<Integer> oi) {
        // Generate a number from 1 to 10
        int rand = (int)(Math.random()*10+1);
        return Optional.of(rand);
    }

    public void runMe() {
        Optional<Integer> optNum = Optional.of(2);
//        Optional<Integer> optional = optIntGenerator( optNum );

//        Optional<Integer> result = optNum.map(this::optIntGenerator);
    }

    public static void main(String[] args) {
        OptionalConfusion oc = new OptionalConfusion();
        oc.runMe();
    }

}
