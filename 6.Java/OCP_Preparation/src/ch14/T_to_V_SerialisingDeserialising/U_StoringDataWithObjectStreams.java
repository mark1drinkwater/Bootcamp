package ch14.T_to_V_SerialisingDeserialising;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class U_StoringDataWithObjectStreams {

    static void saveToFile(List<Gorilla> gorillas, File dataFile)
            throws IOException {
        try (var out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(dataFile)))) {
            for (Gorilla gorilla : gorillas)
                out.writeObject(gorilla);
        }
    }

    static List<Gorilla> readFromFile(File dataFile) throws IOException,
            ClassNotFoundException {
        var gorillas = new ArrayList<Gorilla>();
        try (var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))) {
            while (true) {
                var object = in.readObject();
                if (object instanceof Gorilla g)
                    gorillas.add(g);
            }
        } catch (EOFException e) {
        // File end reached
        }
        return gorillas;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var gorillas = new ArrayList<Gorilla>();
        gorillas.add(new Gorilla("Grodd", 5, false));
        gorillas.add(new Gorilla("Ishmael", 8, true));
        File dataFile = new File("/data/gorilla.data");

        saveToFile(gorillas, dataFile);
        var gorillasFromDisk = readFromFile(dataFile);

        gorillasFromDisk.stream().forEach(System.out::println);

//        System.out.println(gorillasFromDisk);
    }
}
