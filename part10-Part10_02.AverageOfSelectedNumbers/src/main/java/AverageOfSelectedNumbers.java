
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while(true){
            String row = scanner.nextLine();
            if(row.equals("end")){
                break;
            }
            input.add(row);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String question = scanner.nextLine();
        double anwser = 0;
        if(question.equals("p")) {
            anwser = input.stream().mapToInt(s->Integer.valueOf(s)).filter(n->n>0).average().getAsDouble();
        } else{
            anwser = input.stream().mapToInt(s->Integer.valueOf(s)).filter(n->n<0).average().getAsDouble();
        }
        System.out.println("average of the numbers: " + anwser);

    }
}
