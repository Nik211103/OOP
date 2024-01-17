package Seminar.Seminar1;

import java.util.ArrayList;

public class Pikeman extends Walker{
    public Pikeman(String nameHero, int posX, int posY) {
        super(  "Копейщик",
                100,
                100,
                5,
                new int[]{20, 30},
                nameHero, posX, posY,
                2);
    }
    protected Vector2 position;


    @Override
    public String toString() {
        return super.toString();
    }
}
