package Project.AbstractCLasesAndInterface;

import Project.SystemFile.Vector2;

import java.util.ArrayList;
import java.util.Random;

public class Walker extends Hero {

    protected int maxRangeAttack;

    public Walker(String name, int maxHealth, int health, int maxArmor, int armor, int[] damage, int x, int y, int initiative, int maxRangeAttack) {
        super(name, maxHealth, health, maxArmor, armor, damage, x, y, initiative);
        this.maxRangeAttack = maxRangeAttack;
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public void attack(Hero enemy) {
        Random random = new Random();
        enemy.receiveDamage(random.nextInt(damage[0],damage[1]));
    }

    public Vector2 takeStep(Hero hero) {
        int step = 1;
        Vector2 deltas = position.getDeltas(hero.position);
        Vector2 nextPosition = new Vector2(position.getX(), position.getY());

        int deltaX = deltas.getX();
        int deltaY = deltas.getY();

        if (deltaX < 0) {
            nextPosition.setX(nextPosition.getX() + step);
        } else if (deltaX > 0) {
            nextPosition.setX(nextPosition.getX() - step);
        } else if (deltaY < 0) {
            nextPosition.setY(nextPosition.getY() + step);
        } else if (deltaY > 0) {
            nextPosition.setY(nextPosition.getY() - step);
        }

        return nextPosition;
    }

    @Override
    public void step(ArrayList<Hero> enemies, ArrayList<Hero> teammates) {

        if (this.isDead()) return;
        Hero nearestEnemy = nearestAlive(enemies);
        if(nearestEnemy == null) return;
        if (position.getDistance(nearestEnemy) < maxRangeAttack) {
            attack(nearestEnemy);
        } else {
            Vector2 nextPosition = takeStep(nearestEnemy);
            boolean stepIsFree = true;
            for (Hero teammate : teammates) {
                if (nextPosition.equals(teammate.position)) stepIsFree = false;
            }
            if (stepIsFree) position = nextPosition;
        }

    }

}
