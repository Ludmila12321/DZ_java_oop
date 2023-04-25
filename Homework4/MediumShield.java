package Homework4;
import java.util.Random;
public class MediumShield extends Shield{
    public int armor; // эффективность щита 
    
    public int getArmor() {
        return armor;
    }

    public MediumShield(int pointOfShield, int armor) {
        super(pointOfShield);
        this.armor = armor;
    }
    
    @Override
    public String toString() {
        return "MediumShield [armor = " + armor + "]" + "Defend = " + pointOfShield;
    }

    @Override
    public int defence() {
        return new Random().nextInt(30, pointOfShield);
    } 
}