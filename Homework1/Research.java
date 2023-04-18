package Homework1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Research {
    public List<Person> people;

    public Research() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public List<Person> findPeople(String name) {
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.getName().equals(name)) {
                result.add(person);
            }
        }
        return result;
    }

    public void saveToFile(String fileName) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(people);
        oos.close();
        fos.close();
    }

    public void loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        people = (List<Person>) ois.readObject();
        ois.close();
        fis.close();
    }
}
