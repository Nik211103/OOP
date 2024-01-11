package Seminar.Seminar1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Crossbower extends Archer {

    public Crossbower(String nameHero, int posX, int posY) {
        super("Арбалетчик",
                75,
                75,
                2,
                new int[]{10, 15},
                nameHero, posX, posY);
        rangeMaxDamage = 4;
        this.position = new Vector2(posX, posY);
        this.maxArrows = this.currentArrows = 12;
    }



    public void showDistanceToEnemies(List<Hero> enemies) {
        ArrayList<Float> listPositions = new ArrayList<>();
        enemies.forEach(n -> listPositions.add(position.rangeEnemy(n.position)));
        float closeEnemy = Collections.min(listPositions);
        System.out.println(closeEnemy);
    }

    protected int rangeMaxDamage;
     Vector2 position;

    public String getName(){
        return nameHero;
    }




}
