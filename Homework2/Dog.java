package Homework2;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void respondToCall() {
        System.out.println(name + " лает.");
    }

    @Override
    public void play() {
        System.out.println(name + " играет с мячом.");
    }
}
