package OCP.Chapter9.generics;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LowerBoundWildcards {

    private void addSound (List < ? super String > sound) {
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<Object>(strings);

        List<Integer> numbers = new ArrayList<>();

        LowerBoundWildcards lbw = new LowerBoundWildcards();

        lbw.addSound(strings);
        lbw.addSound(objects);
        // We don't want this to compile
        ///lbw.addSound(numbers);

        // String extends Object.   Parent of String is Object
        // Integer extends Object.



        // The parent of IOException is Exception and is also a parent of Object.
        List<? super IOException> exceptions = new ArrayList<Exception>();

        List<IOException> ioE = new ArrayList<>();
        // List<IOException> --> IOException and FileNotFoundException

        List<Exception> e = new ArrayList<>();
        // List<Exception> ---> Literally any Exception

        List<Object> o = new ArrayList<>();
        // List<Object> ---> Literally any Object


        // FileNotFoundException extends IOException


//        ioE.add(new Exception()); // DOES NOT COMPILE
        ioE.add(new IOException());
        ioE.add(new FileNotFoundException());

    }
}
