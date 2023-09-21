package OCP.Chapter3;

public class Switch
{
    public static void main(String[] args) {
        final char a = 'A', e = 'E';
        char grade = 'B';
        switch (grade) {
            default:
            case a:
            case 'B', 'C': System.out.print("great ");
            case 'D': System.out.print("good "); break;
            case e:
            case 'F': System.out.print("not good ");
        }
        System.out.println();

        char[] wolf = {'W', 'e', 'b', 'b', 'y'};

//        for(int m=wolf.length-1; m>=0; --m)
//            System.out.print(wolf[m]);
//        System.out.println();
//        // Works the same. doesn't matter whether it's a pre or post inc. operator.
//        for(int m=wolf.length-1; m>=0; --m)
//            System.out.print(wolf[m]);




    }

//    void findZookeeper(int id) {
//        System.out.print(switch(id) {
//            case 10 -> {yield "Jane";}
//            case 20 -> {yield "Lisa";}
//            case 30 -> "Kelly";
//            case 30 -> "Sarah";
//            default -> "Unassigned";
//        });
//    }

}
