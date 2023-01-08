import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.midi.Soundbank;

public class Employees {
    private List<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        list.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        list.addAll(peopleToAdd);
    }

    public void print() {
        // list.stream().forEach(x->System.out.println(x));
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
