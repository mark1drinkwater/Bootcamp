package OCP.Chapter7;

public record Crane(int numberEggs, String name) {

    public Crane {
        if (numberEggs < 0) throw new IllegalArgumentException();
        if (name == null || name.length() < 1)
            throw new IllegalArgumentException();
        name = name.substring(0,1).toUpperCase()
                + name.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        var mommy = new Crane(4, "Cammy");
        var child = new Crane(4, "Cammy");
        var lamy = new Crane(4, "laMMy");
//        var nullCheck = new Crane(4, null);
        System.out.println(mommy.numberEggs());
        System.out.println(mommy.name());
        System.out.println("Are these equal in value? " + mommy.equals(child));
    }
}

//public record Crane(int numberEggs, String name) {
////    public Crane(int numberEggs, String name) {
////        if (numberEggs < 0) throw new IllegalArgumentException();
////        this.numberEggs = numberEggs;
////        this.name = name;
////    }
//
//}

// records are implicitly final and can't be extended.

//class TestRecord {
//    public static void main(String[] args) {
//        var child = new Crane(0, "Lammy");
//        System.out.println(child.numberEggs());
//        System.out.println(child.name());
//        System.out.println(child);
//    }
//}
