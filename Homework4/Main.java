package Homework4;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();
        archers.addPersons(new Archer("Robin", 100, new Bow(20), new SmallShield(10)))
                .addPersons(new Archer("Bobin", 100, new Bow(15), new SmallShield(5)));
        knights.addPersons(new Knight("John", 150, new Knife(), new BigShield(20)))
                .addPersons(new Knight("Adam", 150, new Knife(), new BigShield(20)));
        Archer archer1 = new Archer("Robin", 100, new Bow(20), new SmallShield(10));
        Archer archer2 = new Archer("Bobin", 100, new Bow(15), new SmallShield(5));
        Battle fight = new Battle(archer1, archer2);
        fight.run();
    }
}
