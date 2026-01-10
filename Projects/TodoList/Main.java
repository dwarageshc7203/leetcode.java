package TodoList;

import java.util.Scanner;

public class Main {
    DbOperations db = new DbOperations();

    private int idInput = 0;
    private String nameInput = "";
    private String descInput = "";

    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, user!");
        System.out.println();

        System.out.println("This is your To-Do List Application!");
        System.out.println();

        System.out.println("What do you want to do?");
        System.out.println();

        System.out.println("1. Create a Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Change status of a Task");
        System.out.println("4. Delete a Task");
        System.out.println("5. Exit Application");
        System.out.println();
        System.out.println("Enter a choice (1, 2, 3, 4, 5) : ");

        while( choice != 5){
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Case 1");
                    break;

                case 2:
                    System.out.println("Case 2");
                    break;
                
                case 3:
                    System.out.println("Case 3");
                    break;

                case 4:
                    System.out.println("Case 4");
                    break;

                case 5:
                    System.out.println("Case 5");
                    break;

                default:
                    System.out.println("Case default");
                    System.out.println("Enter a valid choice - (1, 2, 3, 4, 5)");
                    break;
            }
        }
    }    
}

/* Operations for this project include:
    -> Create Task;
    -> View Task;
    -> Complete Task;
    -> Delete Task
    -> Exit the application; */