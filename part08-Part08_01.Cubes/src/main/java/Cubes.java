
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cube manager = new Cube(null);

        UserInterface ui = new UserInterface();

        ui.start();
    }
}
