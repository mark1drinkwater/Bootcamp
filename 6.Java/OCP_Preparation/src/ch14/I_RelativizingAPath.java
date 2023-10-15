package ch14;

import java.nio.file.Path;
import java.nio.file.Paths;

public class I_RelativizingAPath {
    public static void main(String[] args) {
        // This constructs the relative path from one Path to another
        // 2 Relative paths
        var path1 = Path.of("fish.txt");
        var path2 = Path.of("friendly/birds.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));

        System.out.println();

        // 2 Absolute paths
        Path path3 = Paths.get("E:\\habitat");
        Path path4 = Paths.get("E:\\sanctuary\\raven\\poe.txt");
        System.out.println(path3.relativize(path4));
        System.out.println(path4.relativize(path3));

        // Relativize must both be relative or both be absolute
        Path path5 = Paths.get("/primate/chimpanzee");
        Path path6 = Paths.get("bananas.txt");
//        path5.relativize(path6); // IllegalArgumentException

        // On Windows-based systems. If absolute paths are used
        // Both paths must have the same root directory or drive letter
        Path path7 = Paths.get("C:\\primate\\chimpanzee");
        Path path8 = Paths.get("D:\\storage\\bananas.txt");
//        path7.relativize(path8); // IllegalArgumentException
    }
}
