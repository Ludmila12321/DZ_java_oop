package Homework3;

public interface FamilyTree {
    public void addPerson(Person person);

    public void removePerson(Person person);

    public void setParents(Person person, Person father, Person mother);
}
