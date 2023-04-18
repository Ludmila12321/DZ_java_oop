package Homework1;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void respondToCall() {
        System.out.println(name + " мяукает.");
    }

    public void play() {
        System.out.println(name + " играет с бантиком.");
    }
}
