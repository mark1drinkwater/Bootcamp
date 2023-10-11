package ch1;

// Which of these are redundant?
import java.lang.System; // redundant
import java.lang.*; // redundant
import java.util.Random; // Only need this one
import java.util.*; // Or this one, but not both.

class NumberPicker2 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}

public class G_RedundantImports {
}
