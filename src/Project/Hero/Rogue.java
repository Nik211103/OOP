package Project.Hero;

import Project.AbstractCLasesAndInterface.Walker;

public class Rogue extends Walker {
    public Rogue(String name, int x, int y) {
        super(name,
                100,
                100,
                50,
                50,
                new int[]{20, 30},
                x,
                y,
                2,
                2);
    }

    @Override
    public String getInfo() {
        return "Разбойник";
    }

    @Override
    public String toString() {
        return "Разбойник" + super.toString();
    }
}
