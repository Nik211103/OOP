package Seminar.Seminar1;


public class Peasant extends Walker {
    public Peasant(String nameHero, int posX, int posY) {
        super(  "Кретьянин",
                100,
                100,
                0,
                new int[]{0, 0},
                nameHero, posX, posY,
                0);


    }
protected Vector2 position;


    @Override
    public String toString() {
        return super.toString();
    }
}
