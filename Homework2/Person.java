package Homework2;
import java.util.ArrayList;
import java.util.List;
public class Person {
    private String name;
    private String gender;
    private String birthDate;
    private Person father;
    private Person mother;
    private List<Person> children;

    public Person(String name, String gender, String birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void addChild(Person child) {
        this.children.add(child);
    }
}
