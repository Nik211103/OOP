package Seminar.Seminar1;
import java.util.ArrayList;


public class Monk extends Hero{
    public Monk(String nameHero, int posX, int posY) {
        super(  "Монах",
                50,
                50,
                1,
                new int[]{-35, -30},
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
