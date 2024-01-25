package Project.AbstractCLasesAndInterface;


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

    @Override
    public void step(ArrayList<Hero> enemies, ArrayList<Hero> teammates) {

        if (this.isDead()) return;

        Hero nearestAliveEnemy = nearest(enemies, "Живой", "все");

        if (nearestAliveEnemy == null) return;

        if (position.getDistance(nearestAliveEnemy) < maxRangeAttack) {
            attack(nearestAliveEnemy);
            return;
        }

        moveToward(nearestAliveEnemy, teammates);
    }
}
