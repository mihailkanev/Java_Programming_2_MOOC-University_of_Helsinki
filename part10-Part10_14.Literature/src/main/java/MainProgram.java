import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> books = new ArrayList();
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            
            if (name.equals("")) {
                if (books.size() > 0) {
                    System.out.println(books.size() + " books in total.");
                }
                break;
            }

            System.out.println("Input the age recommendation:");
            Integer age = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(name, age));
        }
        System.out.println("Books: \n");

        Comparator<Book> comparator = Comparator.comparing(Book::getAge)
        .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        for (Book book : books) {
            System.out.println(book);
        }
    }

}
