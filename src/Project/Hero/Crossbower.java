package Project.Hero;

import Project.AbstractCLasesAndInterface.Archer;

public class Crossbower extends Archer {

    public Crossbower(String name, int x, int y) {
        super(name,
                75,
                75,
                25,
                25,
                new int[]{10, 15},
                x,
                y,
                3,
                10,
                10,
                7,
                10,
                2);
    }

    @Override
    public String getInfo() {
        return "Арбалетчик";
    }

    @Override
    public String toString() {
        return "Арбалетчик" + super.toString();
    }
}
