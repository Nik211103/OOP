package Seminar.Seminar1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class Archer extends Hero{
    protected int maxArrows;
    protected int currentArrows;

    public Archer(String classHero, int healthMax, int currentHealth, int armor, int[] damage,
                  String nameHero, int posX, int posY, int initiative){
        super(classHero,healthMax, currentHealth, armor,damage,nameHero,posX,posY,initiative);
    }


protected void attack(Hero enemy) {
    currentArrows -= 1;
    Random random = new Random();
    enemy.getDamage(random.nextInt(damage[0],damage[1]));
}

    public void replenishmentArrows(int arrows){
        if(this.currentArrows + arrows > this.maxArrows){
            this.currentArrows = this.maxArrows;
        }
        else{
            this.currentArrows = this.currentArrows + arrows;
        }
    }

    public void showDistanceToEnemies(List<Hero> enemies) {
        ArrayList<Float> listPositions = new ArrayList<>();
        enemies.forEach(n -> listPositions.add(position.rangeEnemy(n.position)));
        float closeEnemy = Collections.min(listPositions);
        System.out.println(closeEnemy);
    }

    @Override
    public void step(ArrayList<Hero> enemies) {
        if (currentHealth > 0 && currentArrows > 0) {
            Hero nearestEnemy = findNearestAliveEnemy(enemies);
            attack(nearestEnemy);
        } else {
            return;
        }
    }

    protected void getArrows(int newArrows) {
        return;
    }


    @Override
    public String toString() {
        return super.toString() + ", Arrows: " + currentArrows + "/" + maxArrows;
    }
}
