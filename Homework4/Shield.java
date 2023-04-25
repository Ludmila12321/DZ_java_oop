package Homework4;
//абстрактный класс щита
public abstract class Shield implements Defense{
    protected int pointOfShield;

    public Shield(int pointOfShield) {
        this.pointOfShield = pointOfShield;
    }

}
