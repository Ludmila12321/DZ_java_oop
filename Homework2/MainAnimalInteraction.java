package Homework2;

public class MainAnimalInteraction {
    public static void main(String[] args) {
        Human human = new Human("Василий");
        Animal cat = new Cat("Васька");
        Animal dog = new Dog("Бобик");
        Animal hamster = new Hamster("Хома");

        human.callAnimal(cat);
        cat.play();

        human.callAnimal(dog);
        dog.play();

        human.callAnimal(hamster);
        hamster.play();
    } 
}
