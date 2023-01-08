import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Checker checker = new Checker();

        String input = scan.nextLine();
       // checker.allVowels(input);
        //checker.isDayOfWeek(input);
        checker.timeOfDay(input);
    }

    
}
