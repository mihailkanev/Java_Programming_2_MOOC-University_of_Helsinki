
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numRandom = askUser(scanner);
        generateNumbers(numRandom);
    }

    public static int askUser(Scanner scanner) {
        System.out.println("Choose Numbers:");
        int ranNumber = Integer.valueOf(scanner.nextLine());
        return ranNumber;
    }

    public static void generateNumbers(int nums) {
        Random genRandom = new Random();

        for (int i = 0; i < nums; i++) {
            int printNums = genRandom.nextInt(11);
            System.out.println(printNums);
        }
    }
}
