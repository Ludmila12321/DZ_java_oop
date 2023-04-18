package Homework2;

public class Hamster implements Animal {
    private String name;

    public Hamster(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void respondToCall() {
        System.out.println(name + " пищит.");
    }

    @Override
    public void play() {
        System.out.println(name + " бегает в колесе.");
    }
}
