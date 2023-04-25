package Homework4;

import java.util.Random;

public class Warrior<T extends Weapon, D extends Defense> extends Person {
    protected T weapon;
    protected D defence;
    protected  static Random rand = new Random();

    public Warrior(String name, int hp, T weapon, D defence) {
        super(name, hp);
        this.weapon = weapon;
        this.defence = defence;
    }

    public int harm() {
        boolean isHit = rand.nextBoolean();
        int damage = 0;
        if (isHit) {
            damage = rand.nextInt(weapon.damage()+1);
        }
        return damage;
    }
    public Defense getDefence() {
        return defence;
    }
    @Override
    public String toString() {
        return "Warrior{" +
                " name = " + getName() +
                " hp = " + getHp() +
                " weapon = " + weapon +
                " defence = " + defence +
                '}';
    }
}
