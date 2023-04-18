package Homework1;

public class MainHumanandCat {
    public static void main(String[] args) {
        Human human = new Human("Василий");
        Cat cat = new Cat("Васька");
        human.callCat(cat);
        cat.play();

    }
}
