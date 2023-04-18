package Homework1;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void callCat(Cat cat) {
        System.out.println(name + " зовёт " + cat.getName() + "...");
        cat.respondToCall();
    } 
}
