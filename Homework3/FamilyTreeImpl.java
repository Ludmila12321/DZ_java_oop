package Homework3;

public class FamilyTreeImpl implements FamilyTree {
    private Research research;

    public FamilyTreeImpl(Research research) {
        this.research = research;
    }

    @Override
    public void addPerson(Person person) {
        this.research.addPerson(person);
    }

    @Override
    public void removePerson(Person person) {
        this.research.removePerson(person);
    }

    @Override
    public void setParents(Person person, Person father, Person mother) {
        person.setFather(father);
        person.setMother(mother);
        father.addChild(person);
        mother.addChild(person);
    }
}
