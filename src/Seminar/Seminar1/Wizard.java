package Seminar.Seminar1;

public class Wizard extends Hero {

    int maxMana, currentMana;

    public Wizard(String name, int x, int y) {
        super(name,
                100,
                100,
                5,
                5,
                new int[]{20, 30},
                x,
                y,
                1);
        maxMana = 100;
        currentMana = maxMana;
    }

    @Override
    public String getInfo() {
        return "Маг";
    }

    @Override
    public String toString() {
        return "Маг" + super.toString();
    }
}
