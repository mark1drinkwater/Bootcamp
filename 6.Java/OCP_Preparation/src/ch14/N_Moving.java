package ch14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class N_Moving {
    public static void main(String[] args) throws IOException {
//        Files.move(Path.of("/data/copyOfZoo.txt"), Path.of("C:/data/NewZoo/movedZoo.txt"));

        // Atomic Move
        // Any process monitoring the file system never sees an incomplete or partially written file.
        Files.move(Path.of("/data/NewZoo/movedZoo.txt"), Path.of("/data/AucklandZoo/movedZoo.txt"),
                StandardCopyOption.ATOMIC_MOVE);
    }
}
