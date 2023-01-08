import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       ArrayList<Person> persons = new ArrayList<Person>();

       persons.add(new Teacher("Paganini", "Str 123, box 3", 1233333333));
       persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

       printPersons(persons);
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
