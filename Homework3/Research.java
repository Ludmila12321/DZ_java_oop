package Homework3;

import java.util.List;
import java.util.ArrayList;

public class Research {
    private List<Person> people;

    public Research() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public void removePerson(Person person) {
        this.people.remove(person);
    }

    public Person findPerson(String name) {
        for (Person p : this.people) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public void saveToFile(String fileName) {
        // сохранение в файл
    }

    public void loadFromFile(String fileName) {
        // загрузка из файла
    }
}
