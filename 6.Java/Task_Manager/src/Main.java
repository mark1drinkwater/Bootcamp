import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MainApp main = new MainApp();
        main.mainApp();
    }
}

class MainApp() {
    Scanner sc = new Scanner(System.in);

    public void mainApp() {
        int userMenu = 0;
        while (userMenu != -1) {
            System.out.println("Choose a menu option.");
            System.out.println("1. Add a new task.");
            System.out.println("2. View all tasks.");

            switch (userMenu) {
                case 1:
                    System.out.println("Enter the task name:");
                    String taskTitle = sc.nextLine();
                    System.out.println("Enter the task description:");
                    String taskDescription = sc.nextLine();

                    LocalDate date;

                    do {
                        System.out.println("Enter the task due date:");
                        String taskDate = sc.nextLine();

                        try {
                            date = LocalDate.parse(taskDate);
                        } catch (DateTimeParseException e) {
                            System.out.println("Please try again");
                        }

                        System.out.println("We got there");
                    } while (true);


            }

        }
    }
}