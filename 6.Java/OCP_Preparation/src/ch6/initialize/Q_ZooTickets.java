package OCP.Chapter6.initialize;

public class Q_ZooTickets {
    private String name = "BestZoo";

    {
        System.out.print(name + "-");
    }

    private static int COUNT = 0;

    static {
        System.out.print(COUNT + "-");
    }

    static {
        COUNT += 10;
        System.out.print(COUNT + "-");
    }

    public Q_ZooTickets() {
        System.out.print("z-");
    }

    public static void main(String... patrons) {
        new OCP.Chapter6.initialize.Q_ZooTickets();
    }
}
