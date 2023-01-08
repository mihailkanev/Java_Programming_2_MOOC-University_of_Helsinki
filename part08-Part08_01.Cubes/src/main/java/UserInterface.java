import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private ArrayList<Cube> list;
    
    public UserInterface(){
        this.list = new ArrayList<>();
       
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        while(true){
            String input = scanner.nextLine();

            if(input.equals("end")){
                break;
            }

            int num = Integer.valueOf(input);
            Cube newCube = new Cube(null);
            System.out.println(newCube.getCube(num));
        }
    }
}
