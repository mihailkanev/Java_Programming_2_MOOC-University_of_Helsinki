
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (true) {
            Integer row = Integer.valueOf(scanner.nextLine());
            if (row < 0) {
                break;
            }
            list.add(row);
        }
        list.stream().filter(num->num > 0 && num < 6).forEach(x->System.out.println(x));
    }
}
