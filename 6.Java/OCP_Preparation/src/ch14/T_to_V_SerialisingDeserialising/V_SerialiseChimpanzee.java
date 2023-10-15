package ch14.T_to_V_SerialisingDeserialising;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class V_SerialiseChimpanzee {
}

class Chimpanzee implements Serializable {
    private static final long serialVersionUID = 2L;
    private transient String name;
    private transient int age = 10;
    private static char type = 'C';

    @Override
    public String toString() {
        return "Chimpanzee{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                "type='" + type + '\'' +
                '}';
    }

    { this.age = 14; }

    public Chimpanzee() {
        this.name = "Unkown";
        this.age = 12;
        this.type = 'Q';
    }

    public Chimpanzee(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    static void saveToFile(List<Chimpanzee> chimpanzees, File dataFile)
            throws IOException {
        try (var out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(dataFile)))) {
            for (Chimpanzee chimpanzee : chimpanzees)
                out.writeObject(chimpanzee);
        }
    }

    static List<Chimpanzee> readFromFile(File dataFile) throws IOException,
            ClassNotFoundException {
        var chimpanzees = new ArrayList<Chimpanzee>();
        try (var in = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(dataFile)))) {
            while (true) {
                var object = in.readObject();
                if (object instanceof Chimpanzee g)
                    chimpanzees.add(g);
            }
        } catch (EOFException e) {
            // File end reached
        }
        return chimpanzees;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        var chimpanzees = new ArrayList<Chimpanzee>();
        chimpanzees.add(new Chimpanzee("Ham", 2, 'A'));
        chimpanzees.add(new Chimpanzee("Enos", 4, 'B'));
        File dataFile = new File("chimpanzee.data");

        saveToFile(chimpanzees, dataFile);
        var chimpanzeesFromDisk = readFromFile(dataFile);
        System.out.println(chimpanzeesFromDisk);
    }

}


class BabyChimpanzee extends Chimpanzee {
    private static final long serialVersionUID = 3L;
    private String mother = "Mom";
    public BabyChimpanzee() { super(); }
    public BabyChimpanzee(String name, char type) {
        super(name, 0, type);
    }
}
//    Notice that this subclass is serializable because the superclass has implemented
//        Serializable. We now have an additional instance variable. The code to serialize and
//        deserialize remains the same. We can even still cast to Chimpanzee because this is a subclass.