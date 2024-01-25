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
                2);
    }

    @Override
    public String getInfo() {
        return "Монах";
    }

    @Override
    public String toString() {
        return "Монах" + super.toString();
    }
}
