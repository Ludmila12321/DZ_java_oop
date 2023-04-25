package Homework4;
import java.util.Random;
public class BigShield extends Shield {
    public BigShield(int pointOfShield) {
        super(pointOfShield);}
    
    @Override
    public String toString() {
        return "Defend = " + pointOfShield;
    }

    @Override
    public int defence() {
        return new Random().nextInt(20, pointOfShield);
    } 
}
