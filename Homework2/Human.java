package Homework2;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void callAnimal(Animal animal) {
        System.out.println(name + " зовет " + animal.getName() + "...");
        animal.respondToCall();
    } 
}
