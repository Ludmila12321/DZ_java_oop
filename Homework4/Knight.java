package Homework4;

public class Knight extends Warrior<Knife, Defense>{
    public Knight(String name, int hp, Knife weapon, BigShield shield) {
        super(name, hp, weapon, shield);
    }

    @Override
    public String toString() {
        return "Knight{" +
                super.toString()+
                '}';
    }
}
