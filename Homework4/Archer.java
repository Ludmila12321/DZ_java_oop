package Homework4;

public class Archer extends Warrior<Throwing, Defense>{
    public Archer(String name, int hp, Throwing weapon, SmallShield shield) {
        super(name, hp, weapon, shield);
    }

    public int getRange(){
        return rand.nextInt(weapon.getDistance()+1);
    }

    @Override
    public String toString() {
        return "Archer{" +
                super.toString()+
                '}';
    }
}
