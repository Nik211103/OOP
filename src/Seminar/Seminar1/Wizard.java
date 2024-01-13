package Seminar.Seminar1;

import java.util.ArrayList;

public class Wizard extends Hero{
    public Wizard(String nameHero, int posX, int posY) {
        super(  "Колдун",
                50,
                50,
                1,
                new int[]{10, 15},
                nameHero, posX, posY,
                1);
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
