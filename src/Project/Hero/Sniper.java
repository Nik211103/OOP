package Project.Hero;

import Project.AbstractCLasesAndInterface.Archer;

public class Sniper extends Archer {
    public Sniper(String name, int x, int y) {
        super(name,
                75,
                75,
                10,
                10,
                new int[]{15, 25},
                x,
                y,
                3,
                10,
                5,
                15,
                10,
                2);
    }

    @Override
    public String getInfo() {
        return "Снайпер";
    }

    @Override
    public String toString() {
        return "Снайпер" + super.toString();
    }
}
