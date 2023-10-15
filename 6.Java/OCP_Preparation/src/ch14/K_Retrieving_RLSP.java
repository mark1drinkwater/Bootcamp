package ch14;

import java.io.IOException;
import java.nio.file.Paths;

public class K_Retrieving_RLSP {
    public static void main(String[] args) throws IOException {
        // Verify that the path exists
        var p1 = Paths.get("C:/Users/Mark/Desktop/linkMeFile");
        var p2 = Paths.get("C:/data/zoo.txt");

        System.out.println(p1.toRealPath());
        System.out.println(p2.toRealPath());
    }
}
