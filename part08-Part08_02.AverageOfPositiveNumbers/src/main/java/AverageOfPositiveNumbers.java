
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double sum = 0.0;
        int count = 0;

        while (true) {
            System.out.println("Enter number: ");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0) {
                break;
            } else if (input > 0) {
                count++;
                sum += input;
            }
        }
        if (count > 0) {
            System.out.printf("The average is " + 1.0 * sum / count);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
