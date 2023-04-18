package Homework2;

public class Main {
    public static void main(String[] args) {
        Research research = new Research();
        FamilyTree familyTree = new FamilyTreeImpl(research);

        // создание объектов Person и добавление их в Research
        Person person1 = new Person("Иван", "Мужской", "01.05.2001");
        Person person2 = new Person("Мария", "Женский", "15.03.2003");
        Person person3 = new Person("Семён", "Мужской", "28.10.1979");
        Person person4 = new Person("Людмила", "Женский", "21.08.1982");

        research.addPerson(person1);
        research.addPerson(person2);
        research.addPerson(person3);
        research.addPerson(person4);

        // установление связей между объектами Person
        familyTree.setParents(person1, person3, person4);
        person2.setFather(person3);
        person2.setMother(person4);
    }
}
