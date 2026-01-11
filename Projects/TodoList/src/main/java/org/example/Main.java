package TodoList.src.main.java.org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        DbOperations db = new DbOperations();

        int choice = 0;
        int idInput = 0;
        String nameInput = "";
        String descInput = "";

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

        while( choice != 5){
            System.out.println("Enter a choice (1, 2, 3, 4, 5) : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    //System.out.println("Case 1");//create task
                    System.out.println("Enter the task name: ");
                    nameInput = scanner.nextLine();

                    System.out.println("Enter the task description: ");
                    descInput = scanner.nextLine();

                    db.createTask(nameInput, descInput);
                    break;

                case 2:
                    //System.out.println("Case 2");//view tasks
                    db.viewTask();
                    break;

                case 3:
                    //System.out.println("Case 3");//change status
                    System.out.println("Enter the task ID: ");
                    idInput = scanner.nextInt();
                    db.completeTask(idInput);
                    break;

                case 4:
                    //System.out.println("Case 4");//delete task
                    System.out.println("Enter the task ID: ");
                    idInput = scanner.nextInt();
                    db.deleteTask(idInput);
                    break;

                case 5:
                    //System.out.println("Case 5");
                    System.out.println("Exiting application");
                    break;

                default:
                    //System.out.println("Case default");
                    System.out.println("Enter a valid choice - (1, 2, 3, 4, 5)");
                    break;
            }
        }
        scanner.close();
    }
}

/* Operations for this project include:
    -> Create Task;
    -> View Task;
    -> Complete Task;
    -> Delete Task
    -> Exit the application; */