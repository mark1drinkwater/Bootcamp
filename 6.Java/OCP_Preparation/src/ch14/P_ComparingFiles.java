package ch14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class P_ComparingFiles {
    public static void main(String[] args) throws IOException {
        // Since a path may include path symbols & symbolic links
        // The equals() method can't be relied on.

        // snake is a symbolic link to cobra
        // So this one should prints true, but

//        System.out.println(Files.isSameFile(
//                Path.of("C:/data/animals/cobra"),
//                Path.of("C:/data/animals/snake")
//        ));

        System.out.println(
                "Are snake.txt and snakeHide (symbolic link) the same? " +
                Files.isSameFile(
                Path.of("C:/data/animals/snake/snake.txt"),
                Path.of("C:/data/animals/snakeHideout")
        ));


        // this one prints false
        System.out.println(
                "Are ears.png inside monkey and ears.png inside wolf the same? " +
                Files.isSameFile(
                Path.of("C:/data/animals/monkey/ears.png"),
                Path.of("C:/data/animals/wolf/ears.png")
        ));

        ///////////////////////////////////////////////
        // Java12 - mismatch()
        // Examines the contents of the file
        // 0  means mismatch
        System.out.println("Are the contents of monkey.txt and wolf.tx the same? " +
                Files.mismatch(
                Path.of("C:/data/animals/monkey/monkey.txt"), // contains monkey
                Path.of("C:/data/animals/wolf/wolf.txt")));  // contains wolf
    }
}
