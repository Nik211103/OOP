package Seminar.Seminar1;

import java.util.ArrayList;

public class Wizard extends Walker{
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
    public String toString() {
        return super.toString();
    }
}
