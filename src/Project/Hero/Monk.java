package Project.Hero;

import Project.AbstractCLasesAndInterface.Healer;

public class Monk extends Healer {
    public Monk(String name, int x, int y) {
        super(name,
                50,
                50,
                0,
                0,
                new int[]{-10, -15},
                x,
                y,
                2,
                7,
                3,
                100,
                100,
                5);
    }

    @Override
    public String getInfo() {
        return "Лекарь";
    }

    @Override
    public String toString() {
        return "Лекарь " + super.toString();
    }
}
