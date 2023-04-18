package Homework1;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Person {
    private String name;
    private Date birthDate;
    private String gender;
    private List<Person> parents;
    private List<Person> children;

    public Person(String name, Date birthDate, String gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        parents = new ArrayList<>();
        children = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Person> getParents() {
        return parents;
    }

    public void addParent(Person parent) {
        parents.add(parent);
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addChild(Person child) {
        children.add(child);
    }
}