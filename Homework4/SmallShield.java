package Homework4;
import java.util.Random;
public class SmallShield extends Shield {
    public SmallShield(int pointOfShield) {
        super(pointOfShield);
    }
    @Override
    public int defence(){
        return new Random().nextInt(10, pointOfShield);
    }
    @Override
    public String toString() {
        return "Defence " + super.toString();
    }
}
