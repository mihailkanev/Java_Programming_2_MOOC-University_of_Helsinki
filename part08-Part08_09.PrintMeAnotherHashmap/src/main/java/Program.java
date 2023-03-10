
import java.time.YearMonth;
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String string) {
        for(Book y : hashmap.values()){
            if(y.getName().contains(string)){
                System.out.println(y);
            }
        }
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book x : hashmap.values()) {
            System.out.println(x);
        }
    }

}
