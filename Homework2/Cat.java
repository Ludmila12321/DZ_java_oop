package Homework2;

public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void respondToCall() {
        System.out.println(name + " мяукает.");
    }

    @Override
    public void play() {
        System.out.println(name + " играет с бантиком.");
    } 
}
