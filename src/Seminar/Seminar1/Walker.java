package Seminar.Seminar1;

import java.util.ArrayList;
import java.util.Random;

public abstract class Walker extends Hero {


    public Walker(String classHero, int healthMax, int currentHealth, int armor, int[] damage, String nameHero, int posX, int posY, int initiative) {
        super(classHero, healthMax, currentHealth, armor, damage, nameHero, posX, posY, initiative);
    }

    protected void attack(Hero enemy) {
        Random random = new Random();
        enemy.getDamage(random.nextInt(damage[0], damage[1]));
    }

    public void going(Hero enemy){

        Vector2 delta = position.getDelta(enemy.position);

        if (delta.X < 0) {
            position.X++;
            return;
        }
        if (delta.X > 0 ) {
            position.X--;
            return;
        }
        if (delta.Y < 0 ) {
            position.Y++;
            return;
        }
        if (delta.X > 0 ) {
            position.Y--;
        }
    }

    @Override
    public void step(ArrayList<Hero> enemies) {
        if (currentHealth == 0) return;
        Hero tmp = findBestEnemyDistance(enemies);
        if(position.rangeEnemy(tmp.position) < 2){
            attack(tmp);
        }
        else {
            going(tmp);
        }
        Hero nearestEnemy = findBestEnemyDistance(enemies);
        attack(nearestEnemy);
    }


    public Hero findBestEnemyDistance(ArrayList<Hero> enemies) {
        Hero heroTmp = enemies.get(0);
        for (int i = 0; i < enemies.size(); i++) {
            if (this.position.rangeEnemy(enemies.get(i).position) < this.position.rangeEnemy(heroTmp.position) && enemies.get(i).currentHealth > 0) {
                heroTmp = enemies.get(i);
            }
        }
        return heroTmp;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}

