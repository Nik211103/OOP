package Seminar.Seminar1;

import java.util.ArrayList;

public class Rogue extends Hero {
    public Rogue(String nameHero, int posX, int posY) {
        super(  "Разбойник",
                100,
                100,
                5,
                new int[]{20, 30},
                nameHero, posX, posY,
                2);
    }
    protected Vector2 position;

    @Override
    public void step(ArrayList<Hero> enemies) {
        return;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
