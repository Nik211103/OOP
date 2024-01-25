package Project.AbstractCLasesAndInterface;

import java.util.ArrayList;
import java.util.Random;

public abstract class Archer extends Hero {

    protected int maxArrows, arrows, maxRangeShoot, meleeDamage, maxRangeAttack;

    public Archer(String name, int maxHealth, int health, int maxArmor, int armor, int[] damage, int x, int y, int initiative, int maxArrows, int arrows, int maxRangeShoot, int meleeDamage, int maxRangeAttack) {
        super(name, maxHealth, health, maxArmor, armor, damage, x, y, initiative);
        this.maxArrows = maxArrows;
        this.arrows = arrows;
        this.maxRangeShoot = maxRangeShoot;
        this.meleeDamage = meleeDamage;
        this.maxRangeAttack = maxRangeAttack;
    }

    public void receiveArrows(int newArrows) {
        arrows += newArrows;
    }

    public void bringArrows(Human hero, ArrayList<Hero> teammates) {
        hero.setStatus(true);
        if (hero.position.getDistance(this) < 2) {
            hero.giveArrows(this);
            hero.setStatus(false);
            return;
        }

        hero.moveToward(this, teammates);
    }

    protected void shoot(Hero enemy) {
        arrows -= 1;

        Random random = new Random();
        int damagePoint = position.getDistance(enemy) < maxRangeShoot ? random.nextInt(damage[0], damage[1]) : damage[0];
        enemy.receiveDamage(damagePoint);
    }

    @Override
    public void attack(Hero enemy) {
        enemy.receiveDamage(meleeDamage);
    }

    @Override
    public void step(ArrayList<Hero> enemies, ArrayList<Hero> teammates) {

        if (this.isDead()) return;

        Hero nearestEnemy = nearest(enemies, "Живой", "все");

        if (nearestEnemy == null) return;

        double distanceToNearestEnemy = position.getDistance(nearestEnemy);

        if (arrows == 0) {
            if (distanceToNearestEnemy < maxRangeAttack) {
                attack(nearestEnemy);
            } else {
                moveToward(nearestEnemy, teammates);
            }
            return;
        }

        if (distanceToNearestEnemy < maxRangeShoot) {
            shoot(nearestEnemy);
            return;
        }

        moveToward(nearestEnemy, teammates);
    }

    @Override
    public String toString() {
        return super.toString() + ", Стрелы: " + arrows + "/" + maxArrows;
    }
}
