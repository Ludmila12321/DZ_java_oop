package Homework1;
import java.util.List;
public class FamilyTree {
    public Research research;

    public FamilyTree() {
        research = new Research();
    }

    public void addPerson(Person person) {
        research.addPerson(person);
    }

    public void removePerson(Person person) {
        research.removePerson(person);
    }

    public List<Person> findPeople(String name) {
        return research.findPeople(name);
    }
    
} 
