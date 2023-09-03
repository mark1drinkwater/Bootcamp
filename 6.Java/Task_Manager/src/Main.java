public class Main {
    public static void main(String[] args) {

        int userMenu = 0;
        while (userMenu != -1) {
            System.out.println("Choose a menu option.");
            System.out.println("1. Add a new task.");
            System.out.println("2. View all tasks.");

            switch (userMenu) {
                case 1: addTask();
                case 2: displayTasks();
            }

        }

    }



}