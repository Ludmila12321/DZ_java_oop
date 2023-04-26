package Homework5.SchoolManagementSystem;
public class Pupil {
    private String name;
    private int age;
    private int grade;

    public Pupil(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Ученик " + name + ", возраст " + age + ", класс " + grade + ".";
    }
}
