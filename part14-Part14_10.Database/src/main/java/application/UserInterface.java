package application;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoDao database;

    public UserInterface(Scanner scanner, TodoDao database) {
        this.scanner = scanner;
        this.database = database;
    }

    public void start() throws SQLException {
        while (true) {
            System.out.println("");
            System.out.println("Enter command:");
            System.out.println("1) list");
            System.out.println("2) add");
            System.out.println("3) mark as done");
            System.out.println("4) remove");
            System.out.println("x) quit");

            System.out.print("> ");
            String command = this.scanner.nextLine();
            if (command.equals("x")) {
                break;
            }

            if(command.equals("1")){
                System.out.println("Listing the database contents");
                List<Todo> todolist = this.database.list();
                for (Todo todo : todolist) {
                    System.out.println(todo);
                }
            }

            if(command.equals("2")){
                System.out.println("Adding a new todo");
                System.out.println("Enter name");
                String name = scanner.nextLine();
                System.out.println("Enter description");
                String descr = scanner.nextLine();
                Todo todo = new Todo(name, descr, Boolean.FALSE);
                this.database.add(todo);
            }

            if(command.equals("3")){
                System.out.println("Which todo should be marked as done (give the id)?");
                int idToMarkAsDone = Integer.valueOf(this.scanner.nextLine());
                this.database.markAsDone(idToMarkAsDone);
            }

            if(command.equals("4")){
                System.out.println("Which todo should be removed (give the id)?");
                int idToRemove = Integer.valueOf(this.scanner.nextLine());
                this.database.remove(idToRemove);
            }
        }

        System.out.println("Thank you!");
    }

}
