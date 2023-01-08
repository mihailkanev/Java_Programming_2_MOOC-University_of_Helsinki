import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }

            if (input.equals("add")) {
                add();
            } else if (input.equals("list")) {
                print();
            } else if (input.equals("remove")) {
                remove();
            }
        }
    }

    private void remove() {
        System.out.println("Which one is removed?: ");
        int index = Integer.valueOf(scanner.nextLine());
        list.remove(index);
    }

    private void print() {
        list.print();
    }

    private void add() {
        System.out.println("To add:");
        String task = scanner.nextLine();
        if (task != null && !task.isEmpty()) {
            list.add(task);
        }
    }

}
